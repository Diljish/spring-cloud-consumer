package com.startcodingwithdiljish.springcloudconsumer;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("value")
public class Configuration {
    private String message;

    public Configuration() { }

    public Configuration(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
