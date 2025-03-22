package com.example.currentWeather.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("api")
public class Api {
    private String baseUrl;
    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getKey() {
        return key;
    }
}
