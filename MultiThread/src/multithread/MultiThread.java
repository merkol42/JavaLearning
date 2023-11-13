/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class MultiThread {

    public static void main(String[] args) {
        Printer prnt = new Printer("Printer1");
        Printer prnt1 = new Printer("Printer2");

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
