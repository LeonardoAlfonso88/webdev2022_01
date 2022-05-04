package com.webdev.testinyection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.*;
import java.io.*;

@SpringBootApplication
@ImportResource("classpath:dependencies.xml")
public class TestInyectionApplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
        SpringApplication.run(TestInyectionApplication.class, args);
    }

    public static String LongestWord(String sen) {
        String cleanSentence = sen.replaceAll("[^a-zA-Z0-9\\s]", "");
        List<String> words = Arrays.asList(cleanSentence.split(" "));
        words.sort(Comparator.comparingInt(String::length).reversed());
        return words.get(0);
    }

}
