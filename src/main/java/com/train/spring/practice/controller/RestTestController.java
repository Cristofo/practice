package com.train.spring.practice.controller;


import com.train.spring.practice.controller.dto.SongRecord;
import com.train.spring.practice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestTestController {

    private final SongService songService;

    @Autowired
    public RestTestController(SongService songService){
        this.songService = songService;
    }

    @GetMapping("/get-lists-songs")
    public List<SongRecord> getListOfSongs(){

        return songService.getSongRecords();

    }

}
