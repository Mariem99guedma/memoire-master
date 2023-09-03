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

    @GetMapping("/RankingOfTopBooks")
    public ResponseEntity<List<Map<String, Object>>> fetchRankingOfTopBooks(){
        return new ResponseEntity(booksService.fetchListOfBooks(), HttpStatus.OK);
    }

}
