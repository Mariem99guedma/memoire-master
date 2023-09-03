package com.amazonbestsellingbooks.amazonbestsellingbooks.Model;

import com.amazonbestsellingbooks.amazonbestsellingbooks.kafka.KafkaProducer;
import lombok.Data;

@Data
public class Course extends KafkaTransferable {

    private String title;
    private String classroom;
}
