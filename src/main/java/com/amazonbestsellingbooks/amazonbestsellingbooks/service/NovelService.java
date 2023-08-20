package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entity.Novel;
import com.amazonbestsellingbooks.amazonbestsellingbooks.repository.NovelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NovelService {

    @Autowired
    NovelsRepository novelsRepository;

    public List<Novel> getAllNovels(){
        List<Novel> allNovels = novelsRepository.findAll();
        return allNovels;
    }

    public Novel getNovelById(Integer id){
        Optional<Novel> result = novelsRepository.findById(id);
        if(result.isEmpty()) return null;
        return result.get();
    }

    public Novel getNovelByAuthor(String author){
        Optional<Novel> result = novelsRepository.findByAuthor(author);
        if(result.isEmpty()) return null;
        return result.get();
    }


    public Novel updateNovel(Integer id, Novel newNovel){
        //look for the entity to update by ID
        Optional<Novel> result = novelsRepository.findById(id);

        //If we don't find a mach we return nothing
        if(result.isEmpty()) return null;

        //if everything is ok, we update the found result with values form the new Novel
        Novel novelToUpdate = result.get();
        novelToUpdate.setName(newNovel.getName());
        novelToUpdate.setAuthor(newNovel.getAuthor());

        //we save the Novel to update back to the DB
        return  novelsRepository.save(novelToUpdate);
    }

    public void deleteNovel(Integer id){
        //look for the entity to delete by ID
        Optional<Novel> result = novelsRepository.findById(id);

        //if everything is ok, we delete the found result
        if(result.isPresent()) {
            novelsRepository.delete(result.get());
        }
    }
}
