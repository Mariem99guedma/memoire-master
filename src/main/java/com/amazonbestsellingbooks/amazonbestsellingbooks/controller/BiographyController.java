package com.amazonbestsellingbooks.amazonbestsellingbooks.controller;

import com.amazonbestsellingbooks.amazonbestsellingbooks.service.BiographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biography")
public class BiographyController {

    @Autowired
    BiographyService biographyService;

    @GetMapping("/auto/{name}")
    public ResponseEntity<String> autoBiography(@PathVariable(name="name") String name){
        String returnString = biographyService.lookForAutoBiographyBookName(name);
        return new ResponseEntity<>(returnString, HttpStatus.OK);


    }

    @GetMapping("/famous/{name}")
    public ResponseEntity<String> famousBiography(@PathVariable(name="name") String name){
        String returnString = biographyService.lookForFamousBiographyBookName(name);
        return new ResponseEntity<>(returnString, HttpStatus.OK);
    }

}
