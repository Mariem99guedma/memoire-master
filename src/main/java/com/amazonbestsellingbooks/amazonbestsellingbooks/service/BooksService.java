package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import com.amazonbestsellingbooks.amazonbestsellingbooks.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;
    public List<Map<String, Object>> fetchNumberOfCopiesSold(){
        return booksRepository.queryNumberOfCopiesSold();
    }
    public List<Map<String, Object>> fetchMostReviewedBooks(){
        return booksRepository.queryMostReviewedBooks();
    }

    }
