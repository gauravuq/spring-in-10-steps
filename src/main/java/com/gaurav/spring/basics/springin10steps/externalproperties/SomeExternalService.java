package com.gaurav.spring.basics.springin10steps.externalproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${service.app.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
