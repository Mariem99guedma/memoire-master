package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import com.amazonbestsellingbooks.amazonbestsellingbooks.repository.BooksRepository;
import com.amazonbestsellingbooks.amazonbestsellingbooks.repository.BooksRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    @Autowired
    BooksRepository2 booksRepository2;


    public List<Book> fetchListOfBooks(){
        return booksRepository.queryOne();
    }

    public List<Book> fetchListOfBooks2(){
        return booksRepository2.findAll();
    }

    public String lookForFamousBiographyBookName(String name){
        String returnString = "famous biography : "+name+", here.";
        return returnString;
    }
}
