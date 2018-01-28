/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timere;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Andrei
 */
public class TimerSwing {

    public static void main(String[] args) throws InterruptedException {
        ActionListener l = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("X");
            }

        };
        Timer t = new Timer(0, l);
        t.setDelay(1000);
        t.start();
        Thread.sleep(1000);
    }
}
