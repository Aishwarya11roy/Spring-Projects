package com.in28minutes.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//      var game = new MarioGame();
//      var game = new SupercontraGame();
        var game = new Pacman(); //1.Object creation
        var gameRunner = new GameRunner(game); //2.Object creation + wiring of dependency.Here GamingConsole is the dependency of GameRunner

        gameRunner.run();

    }
}
