package com.test.enumconditional.testenumconditional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestEnumConditionalApplication {
	@Autowired
	ConditionalIf conditionalIf;

	public static void main(String[] args) {
		SpringApplication.run(TestEnumConditionalApplication.class, args);

	}

	@PostConstruct
	public void run(){
		this.executeAsUsual();
		this.executeAsEnum(ConditionalEnum.SUM);
	}

	public void executeAsUsual(){
		System.out.println("###############".concat(conditionalIf.calculator("SUBTRACT")));

	}

	public void executeAsEnum(ConditionalEnum conditionalEnum){
		System.out.println("**************".concat(conditionalEnum.calculate()));
	}

}
