package com.slp.forme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.slp.forme.mapper")
public class FormeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormeApplication.class, args);
	}

}
