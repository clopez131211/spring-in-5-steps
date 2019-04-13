package com.lambda.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchimp binarySearch = new BinarySearchimp();
		int result = binarySearch.binarySearch(new int[] {124, 6}, 3);
		System.out.println(result);
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
