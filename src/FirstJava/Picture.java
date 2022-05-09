package FirstJava;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Picture {
    public static void main(String[] args) {
        var f = new JFrame("drawing");
        var lbl = new JLabel("테스트");
        f.setVisible(true);
        f.add(lbl);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        lbl.setIcon(new ImageIcon(img));
        var g = img.createGraphics();
        g.drawLine(0, 0, 600, 400);
        g.setColor(Color.BLUE);
        g.fillRect(300, 200, 120, 100);
        lbl.repaint();
    }
}
