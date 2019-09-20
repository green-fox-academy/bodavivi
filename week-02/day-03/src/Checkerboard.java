import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < 400; i+=50) {
            for (int j = 0; j <= 400; j += 100) {
                graphics.fillRect(j, i, 50, 50);
            }
            i= i+50;
            for (int k = 50; k <= 400; k += 100) {
                graphics.fillRect(k, i, 50, 50);

            }
        }



    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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