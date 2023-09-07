package com.learnbizlinks.demo;

import com.learnbizlinks.demo.game.MarioGame;
import com.learnbizlinks.demo.game.PacmanGame;
import com.learnbizlinks.demo.runner.GameRunner;


public class AppGamingBasicJava {
	//Iteración 1
	public static void main(String[] args) {
		// Instancia del juego Mario
		var marioGame = new MarioGame();
		//Instancia del juego Pacman
		var pacmanGame = new PacmanGame();

		// Instancia del GameRunner (Ejecutador de juegos)
//		var gameRunner = new GameRunner(pacmanGame);
//		gameRunner.run();
	}
}
