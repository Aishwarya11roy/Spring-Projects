package com.in28minutes.learnspringframework;

public class GameRunner {
//    private final MarioGame marioGame;
      private  GamingConsole game;

//    public GameRunner(MarioGame marioGame) {
//        this.marioGame =  marioGame;
//    }
       public GameRunner(GamingConsole game) {
        this.game =  game;
}

    public void run() {
        System.out.println("Running game :" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
