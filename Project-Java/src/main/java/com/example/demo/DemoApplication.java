package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void test(){
		List<String> list = new ArrayList<>();
		list.add("123sdfs");
		list.add("1232323sdfs");
		list.add("sdfs");

		Pattern pattern = Pattern.compile("//");
		Matcher matcher = pattern.matcher(list.get(0));

		list.stream().filter(e-> e.startsWith());


	}
}
