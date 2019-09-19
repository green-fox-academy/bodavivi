import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
       int [][] points = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};

        drawSomething(graphics, points);

        int [][] points2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}} ;
        drawSomething(graphics, points2);



    }

    public static void drawSomething (Graphics graphics, int [][] points){
        int [] xpoints = new int[points.length];
        int [] ypoints = new int[points.length];
        int n = points.length;


        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length ; j++) {
                if (j == 0){
                    xpoints[i] = points[i][j];
                }
                else if (j == 1){
                    ypoints[i] = points [i][j];
                }
            }

        }
        graphics.setColor(new Color(25, 134, 76));
        graphics.drawPolygon(xpoints, ypoints, n);
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