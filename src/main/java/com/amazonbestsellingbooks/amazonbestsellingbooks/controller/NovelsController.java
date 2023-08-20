package com.amazonbestsellingbooks.amazonbestsellingbooks.controller;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entity.Novel;
import com.amazonbestsellingbooks.amazonbestsellingbooks.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/novels")
public class NovelsController {

    @Autowired
    NovelService novelService;

    @GetMapping("/")
    public ResponseEntity<List<Novel>> historic(){
        List<Novel> allNovels = novelService.getAllNovels();
        return new ResponseEntity<>(allNovels, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Novel> getNovelById(@PathVariable(name="id") Integer id){
        Novel resultNovel = novelService.getNovelById(id);
        return new ResponseEntity<>(resultNovel, HttpStatus.OK);
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<Novel> getNovelByAuthor(@PathVariable(name="author") String author){
        Novel resultNovel = novelService.getNovelByAuthor(author);
        return new ResponseEntity<>(resultNovel, HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Novel> updateNovel(@PathVariable(name="id") Integer id,@RequestBody Novel newNovel) {
        Novel resultNovel = novelService.updateNovel(id, newNovel);
        return new ResponseEntity<>(resultNovel, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteNovelById(@PathVariable(name="id") Integer id) {
        novelService.deleteNovel(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
