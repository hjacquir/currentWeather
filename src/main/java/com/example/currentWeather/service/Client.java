package com.example.currentWeather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Client {
    @Autowired
    private Environment environment;

    public void request() throws Exception {
        String apiBaseUrl = environment.getProperty("api.baseUrl");

        assert apiBaseUrl != null;

        if (apiBaseUrl.isBlank()) {
            throw new Exception("Please add the config for api base url");
        }

        System.out.println("Api base url " + apiBaseUrl);

        String apiKey = environment.getProperty("api.key");

        assert apiKey != null;

        if (apiKey.isBlank()) {
            throw new Exception("Please add the config for api key");
        }

        String cityName = "";

        String completeApiUri = apiBaseUrl + "app_id=" + apiKey + "&q=" + cityName;
    }
}
