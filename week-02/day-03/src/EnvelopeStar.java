import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(new Color(45, 255, 151));
        for (int i = 15; i < WIDTH/2 ; i+=15) {
            graphics.drawLine(WIDTH/2, i, WIDTH/2 - i, HEIGHT/2);
            graphics.drawLine(i, HEIGHT/2, WIDTH/2, HEIGHT/2+i);
            graphics.drawLine(WIDTH/2, i, WIDTH/2+i, HEIGHT/2);
            graphics.drawLine(WIDTH/2+i, HEIGHT/2, WIDTH/2, WIDTH - i);

            }
        }






    // Don't touch the code below
    static int WIDTH = 960;
    static int HEIGHT = 960;

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