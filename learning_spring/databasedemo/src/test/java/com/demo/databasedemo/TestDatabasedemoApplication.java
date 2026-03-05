package com.demo.databasedemo;

import org.springframework.boot.SpringApplication;

public class TestDatabasedemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DatabasedemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
