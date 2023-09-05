package com.learnbizlinks.demo.game;

public class PacmanGame implements Game {
    public PacmanGame() {
    }
    //4 metodos -> 4 funciones Saltar, ir hacia adelante, ir hacia atras y tumbarse
    //  Flechas direccionales

    public String up(){
        return "Pacman está saltando";
    }

    public String left(){
        return "Pacman se mueve hacia atras";
    }

    public String right(){
        return "Pacman se mueve hacia adelante";
    }


    public String down(){
        return "Pacman se lanza al suelo";
    }
}
