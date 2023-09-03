package com.amazonbestsellingbooks.amazonbestsellingbooks.repository;

import org.springframework.stereotype.Component;

@Component
public class QueryHelper {

    public final String QUERY_NUMBER_OF_COPIES_SOLD = "SELECT booktitle, COUNT(*) as nbr_copy_sold\n " +
            "FROM BestSellingBooks\n " +
            "GROUP BY booktitle\n " +
            "ORDER by nbr_copy_sold DESC";
    public final String QUERY_MOST_REVIEWED_BOOKS = "SELECT Year, BookTitle, Author ,Nbr_customers_reviews\n " +
            "FROM bestsellingbooks\n " +
            "ORDER BY Nbr_customers_reviews DESC";
}
