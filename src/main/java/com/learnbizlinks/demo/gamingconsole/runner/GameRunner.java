package com.learnbizlinks.demo.gamingconsole.runner;


import com.learnbizlinks.demo.gamingconsole.game.GamingConsole;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) { // Inyección de Depdencia por constructor
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
