package com.devprates.gamelist.controllers;

import com.devprates.gamelist.dto.GameDTO;
import com.devprates.gamelist.dto.GameListDTO;
import com.devprates.gamelist.dto.GameMinDTO;
import com.devprates.gamelist.entities.GameList;
import com.devprates.gamelist.service.GameListService;
import com.devprates.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByGameList(listId);
    }
}