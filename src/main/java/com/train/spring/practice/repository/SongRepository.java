package com.train.spring.practice.repository;

import com.train.spring.practice.repository.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
