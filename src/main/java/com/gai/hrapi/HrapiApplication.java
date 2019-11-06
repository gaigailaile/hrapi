package com.gai.hrapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HrapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrapiApplication.class, args);
	}

}
