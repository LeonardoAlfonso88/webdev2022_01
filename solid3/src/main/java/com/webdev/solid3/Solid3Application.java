package com.webdev.solid3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Solid3Application {

	public static void main(String[] args) {
		JsonFormatter formatter1 = new JsonFormatter();
		XMLFormatter formatter2 = new XMLFormatter();
		SMSFormatter formatter3 = new SMSFormatter();
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";

		System.out.println(formatter1.format(text));
		System.out.println("--------------------------");
		System.out.println(formatter2.format(text));
		System.out.println("--------------------------");
		System.out.println(formatter3.format(text));

		SpringApplication.run(Solid3Application.class, args);
	}

}
