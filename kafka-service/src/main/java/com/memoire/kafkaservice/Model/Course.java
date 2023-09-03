package com.memoire.kafkaservice.Model;

import com.memoire.kafkaservice.kafka.KafkaTransferable;
import lombok.Data;

@Data
public class Course extends KafkaTransferable {

    private String title;
    private String classroom;
}
