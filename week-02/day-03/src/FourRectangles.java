import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random random = new Random();
        int x = 0;
        int y = 0;
        int width= 0;
        int height = 0;
        int red = 0;
        int green = 0;
        int blue = 0;

        for (int i = 0; i < 3; i++) {
            x = random.nextInt(1000);
            y = random.nextInt(1000);
            width = random.nextInt(1000);
            height= random.nextInt(1000);
            red = random.nextInt(255);
            green = random.nextInt(255);
            blue = random.nextInt(255);

            graphics.setColor(new Color (red, green, blue));
            graphics.fillRect(x, y, width, height);


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