package com.amazonbestsellingbooks.amazonbestsellingbooks.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Year;

@Data
@Entity
@Table(name="bestsellingbooks")
public class Book {

    @Id
    Integer id;

    Year year;

    Integer rank;

    String title;

    String author;

    Float rating;

    Long numberCustomerRated;

    Double price;

}
