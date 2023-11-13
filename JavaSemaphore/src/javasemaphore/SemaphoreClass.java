/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasemaphore;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class SemaphoreClass {
    private Semaphore sem = new Semaphore(2);
    
    public void threadFonksiyonu(int id) {
        
        try {
            sem.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread Başlıyor... ID : " + id );
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread Çıkıyor.... ID : " + id);
        
        sem.release();
        
    }
}
