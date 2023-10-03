package com.learnbizlinks.demo.spring.component;

import org.springframework.stereotype.Component;

@Component
public class Datasource {
    public void getDatasource() {
        //TODO Objeto de tipo Datasorce -> URL, user, password, puertos, conecction, ddl
        System.out.println("Se ha obtenido el datasource");
    }
}
