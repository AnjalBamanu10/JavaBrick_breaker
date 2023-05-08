package BrickBreakerGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background extends JPanel implements ActionListener  {

    private Image backgroundImage;
    private JButton startButton, exitButton;

    public Background() {
                // load the background image
        backgroundImage = new ImageIcon("./src/background.png").getImage();

        // create the start button
        startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.BOLD, 20));
        startButton.setBounds(300, 300, 100, 50);
        add(startButton);

        // create the exit button
        exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.setBounds(420, 300, 100, 50);
        add(exitButton);

        // add action listener for the start button
        startButton.addActionListener(this);

        // add action listener for the exit button
        exitButton.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.setColor(Color.WHITE);
        g.drawString("", 220, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==startButton){
            GamePlay gamePlay = new GamePlay();
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Background.this);

            frame.getContentPane().removeAll();
            frame.add(gamePlay);
            frame.invalidate();
            frame.validate();
            gamePlay.requestFocusInWindow();
        }
        else if (e.getSource()==exitButton) {
            System.exit(0);

        }
    }
}
