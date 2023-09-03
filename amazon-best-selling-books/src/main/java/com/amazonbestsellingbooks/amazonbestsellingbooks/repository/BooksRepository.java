package com.amazonbestsellingbooks.amazonbestsellingbooks.repository;

import com.amazonbestsellingbooks.amazonbestsellingbooks.entities.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class BooksRepository {

    private final JdbcTemplate jdbcTemplate;

    private final QueryHelper queryForObject;

    public List<Map<String, Object>> queryNumberOfCopiesSold(){
       return jdbcTemplate.queryForList(queryForObject.QUERY_NUMBER_OF_COPIES_SOLD);
    }
    public List<Map<String, Object>> queryMostReviewedBooks(){
        return jdbcTemplate.queryForList(queryForObject.QUERY_MOST_REVIEWED_BOOKS);
    }

}
