package com.amazonbestsellingbooks.amazonbestsellingbooks.Model;

import lombok.Data;

@Data
public class Course extends KafkaTransferable {

    private String title;
    private String classroom;
}
