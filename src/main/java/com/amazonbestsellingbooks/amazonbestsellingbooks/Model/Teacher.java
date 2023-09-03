package com.amazonbestsellingbooks.amazonbestsellingbooks.Model;

import lombok.Data;

@Data
public class Teacher extends KafkaTransferable {

    private String name;
    private String address;
}
