/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatieCuPoze.alternativ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Andrei
 */
public class ImageProgressBar extends JProgressBar {

    private Image i;

    public ImageProgressBar(Image i) {
        this.i = i;
    }

    public void setI(Image i) {
        this.i = i;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (int) Math.floor((g.getClipBounds().width - i.getWidth(this)) * getValue() / getMaximum());
        int y = (int) (Math.floor((g.getClipBounds().height - i.getHeight(this)) / 2));
        g.drawImage(i, x, y, this);
    }

    public static void main(String[] args) {
        Image img = null;
        try {
            img = ImageIO.read(ImageProgressBar.class.getResource("rip.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ImageProgressBar.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame f = new JFrame();
        ImageProgressBar p = new ImageProgressBar(img);
        f.add(p);
        f.pack();
        f.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            p.setValue(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImageProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
