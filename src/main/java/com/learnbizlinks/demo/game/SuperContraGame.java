package com.learnbizlinks.demo.game;

public class SuperContraGame implements Game {
    public SuperContraGame() {
    }
    //4 metodos -> 4 funciones Saltar, ir hacia adelante, ir hacia atras y tumbarse
    //  Flechas direccionales

    public String up(){
        return "Personaje está saltando";
    }

    public String left(){
        return "Personaje se mueve hacia atras";
    }

    public String right(){
        return "Personaje se mueve hacia adelante";
    }


    public String down(){
        return "Personaje se lanza al suelo";
    }
}
