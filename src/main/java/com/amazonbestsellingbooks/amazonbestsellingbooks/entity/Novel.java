package com.amazonbestsellingbooks.amazonbestsellingbooks.entity;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="novels")
public class Novel {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String author;
}
