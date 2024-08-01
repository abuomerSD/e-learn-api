package com.eltayeb.e_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.eltayeb.e_learn"})
public class ELearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELearnApplication.class, args);
	}

}
