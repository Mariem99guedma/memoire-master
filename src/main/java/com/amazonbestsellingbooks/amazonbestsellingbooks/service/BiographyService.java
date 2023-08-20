package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;

@Service
public class BiographyService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public String lookForAutoBiographyBookName(String name){
        String returnString = "auto biography : " + name + ", here.";


        // Execute the Hive query
        String query = "SELECT Year, Rank, BookTitle AS Sales_Rank\n" +
                "FROM (SELECT Year, Rank, BookTitle,\n" +
                "ROW_NUMBER() OVER (PARTITION BY Year ORDER BY Rank ASC) AS Sales_Rank\n" +
                "FROM bestsellingbooks)\n" +
                "ranked_books\n" +
                "WHERE Sales_Rank <= 5\n" +
                "ORDER BY Year, Sales_Rank";

        return returnString;
    }

    public String lookForFamousBiographyBookName(String name){
        String returnString = "famous biography : "+name+", here.";
        return returnString;
    }
}
