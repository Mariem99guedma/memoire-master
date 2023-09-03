package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Course;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.KafkaTransferable;
import com.amazonbestsellingbooks.amazonbestsellingbooks.kafka.HandleIncomingKafkaMessages;
import org.springframework.stereotype.Service;

@Service
public class CourseService  {

    public void handle(KafkaTransferable toHandle) {
        Course castType = (Course) toHandle;
        System.out.println("this Course service");

    }
}
