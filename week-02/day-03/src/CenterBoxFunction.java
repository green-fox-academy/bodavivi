import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        Random random = new Random();

        for (int i = 0; i <3 ; i++) {
            int x = random.nextInt(1000);

            square(graphics, x);

        }
    }

    public static void square (Graphics graphics, int x){
        graphics.setColor(new Color(43, 204, 105));
        graphics.drawRect((WIDTH/2)-(x/2),(HEIGHT/2)-(x/2), x, x);
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