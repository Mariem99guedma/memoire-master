package com.amazonbestsellingbooks.amazonbestsellingbooks.kafka;

import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Course;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.KafkaTransferable;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Teacher;
import com.amazonbestsellingbooks.amazonbestsellingbooks.service.CourseService;
import com.amazonbestsellingbooks.amazonbestsellingbooks.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HandleIncomingKafkaMessages {

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    public void handle(KafkaTransferable toHandle){
        if(toHandle.getClass().isInstance(Teacher.class)){
            teacherService.handle(toHandle);
        }

        if(toHandle.getClass().isInstance(Course.class)){
            courseService.handle(toHandle);
        }
    };

}
