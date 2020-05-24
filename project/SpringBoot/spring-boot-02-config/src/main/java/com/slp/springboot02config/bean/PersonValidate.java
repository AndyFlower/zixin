package com.slp.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Component
@ConfigurationProperties(prefix = "personval")
@Validated
public class PersonValidate {
    @Email
    private String lastName;
}
