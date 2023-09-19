package com.learnbizlinks.demo.spring;

import com.dizstance.modelexample.model.Address;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Configuration
//@ComponentScan("com.learnbizlinks.demo")
public class MyAppConfiguration {

    @Bean
    public String name1(){
        return "Jorge";
    }

    @Bean("name")
    public String name2() {
        return "Aaron";
    }

    @Bean
    public Person personA(
            @Qualifier("name")
            String asd) {
        return new Person(asd, 27, "Jr. Los canelos 242");
    }

    @Bean
    public PersonClass personB() {
        return new PersonClass("Aaron", 27, "Direccion random");
    }
}
