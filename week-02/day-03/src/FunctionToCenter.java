import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        Random random = new Random();
        
        int x = 0;
        int y = 0;

        graphics.setColor(new Color(84, 24, 128));
        for (x = 0; x <= 320; x+=20) {
            lines(x,y,graphics);

        }
        x = 0;
        y = 0;
        graphics.setColor(new Color(44, 22, 115));

        for (y = 0; y <= 320; y += 20 ){
            lines(x,y,graphics);
        }
        x = 320;
        y= 0;
        graphics.setColor(new Color(33, 96, 141));

        for (y = 0; y <= 320; y += 20){
            lines(x,y,graphics);
        }
        x = 0;
        y = 320;
        graphics.setColor(new Color(25, 134, 76));

        for (x = 0; x <= 320; x+= 20){
            lines(x,y,graphics);
        }






    }

    public static void lines(int x, int y, Graphics graphics){
        graphics.drawLine(x,y,WIDTH/2, HEIGHT/2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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