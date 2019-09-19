import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        Random random = new Random();




        graphics.setColor(new Color(0, 0, 20));
        graphics.fillRect(0,0,WIDTH, HEIGHT);

        for (int i = 0; i < 500; i++) {
            Random colorRandom = new Random();
            int color = colorRandom.nextInt(255);
            graphics.setColor(new Color(color, color, color));

            Random sizeRandom = new Random();
            int size = sizeRandom.nextInt(4);
            graphics.fillRect(random.nextInt(WIDTH), random.nextInt(HEIGHT), size,size);

        }







    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}