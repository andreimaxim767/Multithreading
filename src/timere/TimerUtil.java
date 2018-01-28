/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timere;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Andrei
 */
public class TimerUtil {
    public static void main(String[] args) {
        Timer t = new Timer();
        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                System.out.println("Y");
            }
            
        };
        t.schedule(task, 0, 1000);
    }
}
