package com.example.currentWeather.service;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Client {
    private final Api api;

    public Client(Api api) {
        this.api = api;
    }

    public void request() throws Exception {
        String apiBaseUrl = api.getBaseUrl();

        assert apiBaseUrl != null;

        if (apiBaseUrl.isBlank()) {
            throw new Exception("Please add the config for api base url");
        }

        System.out.println("Api base url " + apiBaseUrl);

        String apiKey = api.getKey();

        assert apiKey != null;

        if (apiKey.isBlank()) {
            throw new Exception("Please add the config for api key");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city name : ");

        String cityName = scanner.next();

        String completeApiUri = "%s?app_id=%s&q=%s";

        completeApiUri = String.format(completeApiUri, apiBaseUrl, apiKey, cityName);
    }
}
