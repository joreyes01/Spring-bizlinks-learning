package com.learnbizlinks.demo.runner;

import com.learnbizlinks.demo.game.*;

public class GameRunner {
//    PacmanGame pacmanGame = new PacmanGame();
////    CrashBandicootGame crashBandicootGame = new CrashBandicootGame();
////    SuperContraGame superContraGame = new SuperContraGame();

    Game game1 = new MarioGame();

    public void run(){
        System.out.println(game1.up());
    }

}
