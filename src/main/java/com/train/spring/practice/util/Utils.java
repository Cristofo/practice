package com.train.spring.practice.util;

import com.train.spring.practice.controller.dto.SongRecord;
import com.train.spring.practice.repository.entity.SongEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static List<SongRecord> mySongRecord(List<SongEntity> songEntityList){

        return songEntityList.stream()
                .map(songEntity ->
                        new SongRecord(songEntity.getTitle(), songEntity.getArtist()))
                .collect(Collectors.toList());

    }
}
