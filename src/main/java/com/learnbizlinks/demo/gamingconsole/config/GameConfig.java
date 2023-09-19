package com.learnbizlinks.demo.gamingconsole.config;

import com.learnbizlinks.demo.gamingconsole.game.GamingConsole;
import com.learnbizlinks.demo.gamingconsole.game.MarioGame;
import com.learnbizlinks.demo.gamingconsole.game.PacmanGame;
import com.learnbizlinks.demo.gamingconsole.game.XmenGame;
import com.learnbizlinks.demo.gamingconsole.runner.GameRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean
    public MarioGame marioGame(){
        return new MarioGame();
    }

    @Bean
    public PacmanGame pacmanGame (){
        return new PacmanGame();
    }

    @Bean
    public XmenGame xmenGame(){
        return new XmenGame();
    }

    @Bean
    public GameRunner gameRunner(
            @Qualifier("marioGame")
            GamingConsole game) {
        return new GameRunner(game);
    }
}
