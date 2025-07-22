package com.train.spring.practice.util;

import com.train.spring.practice.controller.dto.SongRecord;
import com.train.spring.practice.repository.entity.Song;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static List<SongRecord> mySongRecord(List<Song> songList){

        return songList.stream()
                .map(song ->
                        new SongRecord(song.getTitle(), song.getArtist()))
                .collect(Collectors.toList());

    }
}
