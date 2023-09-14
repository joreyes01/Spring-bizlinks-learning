package com.learnbizlinks.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringJava {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfiguration.class);
        System.out.println(context.getBean("personA"));

        // TODO 1: Configurar el contexto de Spring (@Configuration)
        // TODO 2: Crear el primer Spring Bean (@Bean)
        // TODO 3: Iniciar el contexto de Spring (Spring Context)
        // TODO 4: Mostrar los Beans inicializados

    }
}
