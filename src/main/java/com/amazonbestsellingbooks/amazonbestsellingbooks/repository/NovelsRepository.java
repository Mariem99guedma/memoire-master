package com.amazonbestsellingbooks.amazonbestsellingbooks.repository;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entity.Novel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NovelsRepository extends JpaRepository<Novel, Integer> {


    Optional<Novel> findByAuthor(String author);

}
