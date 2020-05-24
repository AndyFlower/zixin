package com.slp.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "personsource")
public class PersonPropertySource {
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonPropertySource{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}
