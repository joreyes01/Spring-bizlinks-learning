package com.learnbizlinks.demo;

import com.learnbizlinks.demo.game.MarioGame;
import com.learnbizlinks.demo.game.PacmanGame;
import com.learnbizlinks.demo.game.XmenGame;
import com.learnbizlinks.demo.runner.GameRunner;


public class AppGamingBasicJava {
	//Iteración 1
	public static void main(String[] args) {

		// Instancia del juego
		MarioGame marioGame = new MarioGame();
		//Instancia del juego Pacman
		PacmanGame pacmanGame = new PacmanGame();
		//Instancia del juego Xmen
		XmenGame xmen = new XmenGame();

		// Instancia del GameRunner (Ejecutador de juegos)
		var gameRunner = new GameRunner(xmen);
		gameRunner.run();

	}
}
