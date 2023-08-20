package com.amazonbestsellingbooks.amazonbestsellingbooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AmazonBestSellingBooksApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public static void main(String[] args) {
		SpringApplication.run(AmazonBestSellingBooksApplication.class, args);
	}
	private static final String SHOW_DATABASES_QUERY = "show databases";

	//List<Map<String, Object>> databases = jdbcTemplate.queryForList(SHOW_DATABASES_QUERY);
}
