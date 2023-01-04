package com.example.jenkins.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void checkValue() {
		int value = Application.checkValue();
		Assertions.assertEquals(1, value);
	}
}
