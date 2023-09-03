package com.amazonbestsellingbooks.amazonbestsellingbooks.kafka;


import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Course;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.KafkaTransferable;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MessageType {


	OBJECT("Teacher", Teacher.class),
	OBJECT2("Course", Course.class);


	private final String type;
	private final Class<? extends KafkaTransferable> deserializationClass;

}
