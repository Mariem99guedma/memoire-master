package com.memoire.kafkaservice.Model;

import com.memoire.kafkaservice.kafka.KafkaTransferable;
import lombok.Data;

@Data
public class Teacher extends KafkaTransferable {

    private String name;
    private String address;
}
