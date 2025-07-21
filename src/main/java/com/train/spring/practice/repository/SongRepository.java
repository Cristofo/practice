package com.train.spring.practice.repository;

import com.train.spring.practice.repository.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<SongEntity, Long> {
}
