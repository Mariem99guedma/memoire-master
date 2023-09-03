package com.amazonbestsellingbooks.amazonbestsellingbooks.repository;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class BooksRepository {


    private final JdbcTemplate jdbcTemplate;


    public List<Book> queryOne(){
       return jdbcTemplate.queryForList(QueryHelper.QUERY_ONE, Book.class);
    }
}
