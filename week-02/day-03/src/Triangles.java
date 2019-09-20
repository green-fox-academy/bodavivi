import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(new Color (34,54,64));
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        int a = 6;
        int b = 3;
        int c = 3;


        for (int i = 0; i < 39; i++) {
            graphics.setColor(new Color(255, 0, 148));
            graphics.drawLine(a, 350, b, HEIGHT-c);
            a += 6;
            b+= 3;
            c+= 3;
        }
        int d = 234;
        int e = 237;
        int f = 3;

        for (int i = 0; i <=40; i++) {
            graphics.setColor(new Color(45, 255, 151));

            graphics.drawLine(d, 350, e,350+f);
            d-=6;
            e-=3;
            f-=3;


        }

        int g = 114;
        int h = 236;
        int j = 117;
        int k = 236;

        for (int i = 0; i < 39 ; i++) {
            graphics.setColor(new Color(255, 236, 0));

            graphics.drawLine(g,h,j,k);
            g-= 3;
            h+= 3;
            j+= 3;
            k+=3;


        }


        graphics.drawLine(117,117,126,126);











    }

    // Don't touch the code below
    static int WIDTH = 350;
    static int HEIGHT = 350;

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