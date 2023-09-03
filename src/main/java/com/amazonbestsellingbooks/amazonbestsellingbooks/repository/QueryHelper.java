package com.amazonbestsellingbooks.amazonbestsellingbooks.repository;

public class QueryHelper {

    public static final String QUERY_ONE = "SELECT Year, Rank, BookTitle AS Sales_Rank\n" +
            "FROM (SELECT Year, Rank, BookTitle,\n" +
            "ROW_NUMBER() OVER (PARTITION BY Year ORDER BY Rank ASC) AS Sales_Rank\n" +
            "FROM bestsellingbooks)\n" +
            "ranked_books\n" +
            "WHERE Sales_Rank <= 5\n" +
            "ORDER BY Year, Sales_Rank";
}
