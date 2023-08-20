package com.amazonbestsellingbooks.amazonbestsellingbooks.controller;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import com.amazonbestsellingbooks.amazonbestsellingbooks.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BiographyController {

    @Autowired
    BooksService booksService;

    @GetMapping("/")
    public ResponseEntity<List<Book>> fetchListOfBooks(){
        return new ResponseEntity<>(booksService.fetchListOfBooks(), HttpStatus.OK);
    }


    @GetMapping("/v2")
    public ResponseEntity<List<Book>> fetchListOfBooks2(){
        return new ResponseEntity<>(booksService.fetchListOfBooks2(), HttpStatus.OK);
    }

    @GetMapping("/author/{name}")
    public ResponseEntity<String> famousBiography(@PathVariable(name="name") String name){
        String returnString = booksService.lookForFamousBiographyBookName(name);
        return new ResponseEntity<>(returnString, HttpStatus.OK);
    }

}
