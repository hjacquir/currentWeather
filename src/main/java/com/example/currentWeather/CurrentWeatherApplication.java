package com.example.currentWeather;

import com.example.currentWeather.service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrentWeatherApplication implements CommandLineRunner {
	@Autowired
	private Client client;

	public static void main(String[] args) {
		SpringApplication.run(CurrentWeatherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			client.request();
		} catch (Exception e) {
			System.out.println("An error occured : " + e.getMessage());
		}
	}
}
