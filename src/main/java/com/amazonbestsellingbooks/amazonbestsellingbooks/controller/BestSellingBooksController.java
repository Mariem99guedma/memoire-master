package com.amazonbestsellingbooks.amazonbestsellingbooks.controller;

import com.amazonbestsellingbooks.amazonbestsellingbooks.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BestSellingBooksController {

    @Autowired
    BooksService booksService;


    @GetMapping("/NumberOfCopiesSold")
    public ResponseEntity<List<Map<String, Object>>> fetchNumberOfCopiesSold(){
        return new ResponseEntity<>(booksService.fetchNumberOfCopiesSold(), HttpStatus.OK);
    }
    @GetMapping("/MostReviewedBooks")
    public ResponseEntity<List<Map<String, Object>>> fetchMostReviewedBooks(){
        return new ResponseEntity<>(booksService.fetchMostReviewedBooks(), HttpStatus.OK);
    }

}
