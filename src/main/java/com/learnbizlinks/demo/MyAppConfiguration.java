package com.learnbizlinks.demo;

import com.learnbizlinks.demo.spring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfiguration {

    @Bean
    public String name(){
        return "Jorge 2";
    }


    @Bean
    public Person personA(String name){
        return new Person(name, 27, "Jr. los canelos 242");
    }

    //TODO Crear un nuevo Bean que retorno un atributo de Person(name, age, address) y mostarlo
}
