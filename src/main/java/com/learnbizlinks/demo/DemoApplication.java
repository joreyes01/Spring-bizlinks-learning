package com.learnbizlinks.demo;

import com.learnbizlinks.demo.game.Game;
import com.learnbizlinks.demo.game.PacmanGame;
import com.learnbizlinks.demo.runner.GameRunner;


public class DemoApplication {

	public static void main(String[] args) {
		GameRunner gameRunner = new GameRunner();
		gameRunner.run();
	}

}
