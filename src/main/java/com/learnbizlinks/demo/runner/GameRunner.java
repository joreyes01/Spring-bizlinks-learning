package com.learnbizlinks.demo.runner;

import com.learnbizlinks.demo.game.*;

public class GameRunner {
    private PacmanGame game;

    public GameRunner(PacmanGame game) {
        this.game = game;
    }

    public void run(){
        //Validamos qué juego se está ejecutando mostrándolo en pantalla
        System.out.println("Running Game : " + game);

        //Acciones del juego
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
