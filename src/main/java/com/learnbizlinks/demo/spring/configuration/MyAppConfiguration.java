package com.learnbizlinks.demo.spring.configuration;

import com.learnbizlinks.demo.spring.model.PersonClass;
import com.learnbizlinks.demo.spring.model.PersonRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfiguration {

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public String name() {
        return "Jorge";
    }

    @Bean
    public PersonRecord personRecord() {
        return new PersonRecord("Jorge Aaron", 27, "Jr. Los canelos 242");
    }

    @Bean
    public PersonClass personUsingClass() {
        return new PersonClass("Jorge Aaron", 27, "Jr. Los canelos 242");
    }

}
