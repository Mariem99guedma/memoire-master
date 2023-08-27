package com.amazonbestsellingbooks.amazonbestsellingbooks.controller;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import com.amazonbestsellingbooks.amazonbestsellingbooks.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BiographyController {

    @Autowired
    BooksService booksService;

    @GetMapping("/RankingOfTopBooks")
    public ResponseEntity<List<Map<String, Object>>> fetchRankingOfTopBooks(){
        return new ResponseEntity<>(booksService.fetchRankingOfTopBooks(), HttpStatus.OK);
    }
    @GetMapping("/MostReviewedBooks")
    public ResponseEntity<List<Map<String, Object>>> fetchMostReviewedBooks(){
        return new ResponseEntity<>(booksService.fetchMostReviewedBooks(), HttpStatus.OK);
    }

    @GetMapping("/author/{name}")
    public ResponseEntity<String> famousBiography(@PathVariable(name="name") String name){
        String returnString = booksService.lookForFamousBiographyBookName(name);
        return new ResponseEntity<>(returnString, HttpStatus.OK);
    }

}
