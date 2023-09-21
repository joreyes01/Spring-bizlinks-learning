package com.learnbizlinks.demo;

import com.learnbizlinks.demo.gamingconsole.config.GameConfig;
import com.learnbizlinks.demo.gamingconsole.runner.GameRunner;
import com.learnbizlinks.demo.spring.model.PersonRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringJava {


    public static void main(String[] args) {
        // TODO 1: Configurar el contexto de Spring (@Configuration)
        // TODO 2: Crear el primer Spring Bean (@Bean)
        // TODO 3: Iniciar el contexto de Spring (Spring Context)
        // TODO 4: Mostrar los Beans inicializados
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        GameRunner gameRunner = (GameRunner) context.getBean("gameRunner");
        gameRunner.run();


    }
}
