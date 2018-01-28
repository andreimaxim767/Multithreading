/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaduri;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class Threaduri {

    public static void main(String[] args) {
        Fir f = new Fir();
        f.start();

        Thread t = new Thread(new Iepure());
        t.start();
    }
}

class Fir extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            System.out.println("F: " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Fir.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }

}

class Animal {
}

class Iepure extends Animal implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            System.out.println("I: " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Fir.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }

}
