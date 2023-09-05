package com.learnbizlinks.demo.game;

public class CrahsBandicootGame implements Game {
    public CrahsBandicootGame() {
    }
    //4 metodos -> 4 funciones Saltar, ir hacia adelante, ir hacia atras y tumbarse
    //  Flechas direccionales

    public String up(){
        return "Crash está saltando";
    }

    public String left(){
        return "Crash se mueve hacia atras";
    }

    public String right(){
        return "Crash se mueve hacia adelante";
    }


    public String down(){
        return "Crash se lanza al suelo";
    }
}
