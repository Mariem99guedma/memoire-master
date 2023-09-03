package com.amazonbestsellingbooks.amazonbestsellingbooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
public class AmazonBestSellingBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonBestSellingBooksApplication.class, args);
	}

}
