package com.train.spring.practice.service;


import com.train.spring.practice.controller.dto.SongRecord;
import com.train.spring.practice.repository.SongRepository;
import com.train.spring.practice.repository.entity.SongEntity;
import com.train.spring.practice.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {


    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository){
        this.songRepository =  songRepository;
    }

    public List<SongRecord> getSongRecords(){
        List<SongEntity> songEntities = songRepository.findAll();

        return Utils.mySongRecord(songEntities);

    }


    //Add actuator
    // upload to github
    // add spring security
    // add resilience
    // add springboot contexts
    // add controller advice
    // add junit
}
