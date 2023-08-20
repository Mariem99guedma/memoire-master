package com.amazonbestsellingbooks.amazonbestsellingbooks.repository;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository2 extends JpaRepository<Book, Integer> {
}
