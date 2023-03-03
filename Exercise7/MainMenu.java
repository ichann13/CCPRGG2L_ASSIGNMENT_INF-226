import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu() {

        // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon snakeImage = new ImageIcon("snake4.gif");
        imageLabel.setIcon(snakeImage);
        // Add image to frame
        this.add(imageLabel);

        // JButton
        JButton button = new JButton();
        button.setText("SNAKE BITE");
        button.setFont(new Font("Arial", Font.BOLD, 50));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        // add button to frame
        this.add(button);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350, 450);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.DARK_GRAY);
        // lock frame
        this.setResizable(false);

    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            new ColorMenu();

            dispose();

        }

    }
}