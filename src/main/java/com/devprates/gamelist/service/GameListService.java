package com.devprates.gamelist.service;

import com.devprates.gamelist.dto.GameDTO;
import com.devprates.gamelist.dto.GameListDTO;
import com.devprates.gamelist.dto.GameMinDTO;
import com.devprates.gamelist.entities.Game;
import com.devprates.gamelist.entities.GameList;
import com.devprates.gamelist.repositories.GameListRepository;
import com.devprates.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}