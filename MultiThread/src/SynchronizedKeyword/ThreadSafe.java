/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SynchronizedKeyword;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class ThreadSafe {
    private int count = 0;
    
    private synchronized void arttır() {
        count++;
    }

    public int getCount() {
        return count;
    }
    
    public void threadsRunner() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttır();
                }
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttır();
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) { 
            System.out.println("thread e");
        }
    }
    
    public static void main(String[] args) {
        ThreadSafe threadsafe = new ThreadSafe();
        
        threadsafe.threadsRunner();
        
        System.out.println(threadsafe.getCount());
    }
}
