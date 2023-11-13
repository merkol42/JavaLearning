/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread2;

import java.util.logging.Level;
import java.util.logging.Logger;
import multithread.MultiThread;

/**
 *
 * @author merkol
 */
public class Main {
    public static void main(String[] args) {
        Thread prnt = new Thread(new Printer("Printer"));
        Thread prnt1 = new Thread(new Printer("Printer"));

        prnt.start();
        prnt1.start();
        
        try {
            prnt.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Main thread");
    }
    
}
