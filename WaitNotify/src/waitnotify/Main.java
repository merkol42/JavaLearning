/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waitnotify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class Main {
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();
    
        Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            wn.thread1Func();
        }
        });
    
        Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            wn.thread2Func();
        }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
