/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatieCuPoze;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Andrei
 */
public class Cal extends javax.swing.JPanel implements Runnable {

    private int number;

    /**
     * Creates new form Cal
     */
    public Cal(int n) {
        number = n;
        initComponents();
        l.setText("Cal " + n);
    }

    public int getNumber() {
        return number;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l = new javax.swing.JLabel();
        p = new javax.swing.JProgressBar();
        lPic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setMinimumSize(new java.awt.Dimension(278, 110));
        setPreferredSize(new java.awt.Dimension(278, 110));

        l.setText("Cal XXXXX");
        l.setMaximumSize(new java.awt.Dimension(48, 30));
        l.setMinimumSize(new java.awt.Dimension(48, 30));
        l.setPreferredSize(new java.awt.Dimension(50, 105));

        p.setMaximum(200);
        p.setString("");
        p.setStringPainted(true);

        lPic.setMaximumSize(new java.awt.Dimension(110, 110));
        lPic.setPreferredSize(new java.awt.Dimension(110, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addComponent(lPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel l;
    private javax.swing.JLabel lPic;
    private javax.swing.JProgressBar p;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        lPic.setIcon(new ImageIcon(getClass().getResource("cal.gif")));
        for (int i = p.getMinimum(); i <= p.getMaximum(); i++) {
            p.setValue(i);
            p.setString(i + " m");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException ex) {
                return;
            }
            //Color c = p.getForeground();
            if (Math.random() > 0.99) { // impiedicare
                Color c = p.getForeground();
                p.setForeground(Color.yellow);
                lPic.setIcon(new ImageIcon(getClass().getResource("waiting.jpg")));
                try {
                    Thread.sleep((int) (Math.random() * 500));
                    
                } catch (InterruptedException ex) {
                    return;
                }
                lPic.setIcon(new ImageIcon(getClass().getResource("cal.gif")));
                p.setForeground(c);
            }
            if (Math.random() > 0.997) {    // ghinion fatal
                p.setForeground(Color.red);
                lPic.setIcon(new ImageIcon(getClass().getResource("rip.jpg")));
                return;
            }
        }
        p.setForeground(Color.green);
        lPic.setIcon(new ImageIcon(getClass().getResource("victorie.jpg")));
    }
}