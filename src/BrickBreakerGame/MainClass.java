package BrickBreakerGame;

import javax.swing.*;

public class MainClass {
       public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Brick Breaker");
        frame.setSize(700,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
//        GamePlay gamePlay = new GamePlay();
//        frame.add(gamePlay);
        Background background= new Background();
        frame.add(background);
        frame.setVisible(true);

       }
}
