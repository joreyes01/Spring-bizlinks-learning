package com.learnbizlinks.demo;

import com.learnbizlinks.demo.gamingconsole.config.GameConfig;
import com.learnbizlinks.demo.gamingconsole.runner.GameRunner;
import com.learnbizlinks.demo.spring.component.Datasource;
import com.learnbizlinks.demo.spring.configuration.MyAppConfiguration;
import com.learnbizlinks.demo.spring.model.Address;
import com.learnbizlinks.demo.spring.model.PersonRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//TODO Intentar - Más de un archivo de configuración

public class AppSpringJava {

    // TODO 1: Configurar el contexto de Spring (@Configuration)
    // TODO 2: Crear el primer Spring Bean (@Bean)
    // TODO 3: Iniciar el contexto de Spring (Spring Context)
    // TODO 4: Mostrar los Beans inicializados

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(MyAppConfiguration.class);

        // TODO 1: Listar todos los Beans - ToString (Java 8) vs Java Records (Java 17 -15*)
//        System.out.println(ctx.getBean("age"));
//        System.out.println(ctx.getBean("name"));
//        System.out.println(ctx.getBean(Address.class));

//        for (int i=0; i< ctx.getBeanDefinitionCount(); i++) {
//            System.out.println(ctx.getBeanDefinitionNames()[i]);
//        }
        //API Stream foreach
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(ctx.getBean("personRecord")); //toString
//        System.out.println(ctx.getBean("personUsingClass")); //toString -> Muestra espacio en memoria JVM -> Atributos

        // TODO 2: Relaciones entre Beans (Parámetro y Métodos) (Person.class & Beans: name, age, address)
//        System.out.println(ctx.getBean("personParameters"));
//        System.out.println(ctx.getBean("personMethodCall"));

        // TODO 3: Múltiple Candidatos a inyectar (Person.class) - @Primary
        //System.out.println(ctx.getBean(PersonRecord.class));

        // TODO 4: Múltiple Candidatos a inyectar (Person.class) - @Qualifier & Bean Names
        //System.out.println(ctx.getBean("personParameters"));

        // TODO 5: Usar los Spring Beans (class & casting)
        ((Datasource)ctx.getBean("myDatasource")).getDatasource();
        ctx.getBean(Datasource.class).getDatasource();

        // TODO LAB : Desacoplamiento nivel 3

        // TODO 6: Estereotipo @Component vs @Bean (Datasource.class)

        // TODO 7: Usando Componentes - Mismo Package

        // TODO 8: Usando Componentes - Distinto Package - Component Scan

    }
}
