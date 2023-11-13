/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waitnotify;

import java.util.Scanner;

/**
 *
 * @author merkol
 */
public class WaitNotify {
    private Object lock = new Object(); // !sync(this) -> sync(lock)
    public void thread1Func() {
        synchronized (this) {
            System.out.println("Thread1 Çalışıyor");
            System.out.println("Thread1 2nin kendisini uyandırmasını bekliyor");
            
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupt e");
            }
            
            System.out.println("Thread1 devam ediyor");
        }
    }
    
    public void thread2Func() {
        Scanner scan = new Scanner(System.in);
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("sleep");
        }
        
        synchronized (this) {
            System.out.println("Thread2 çalışıyor");
            System.out.println("Devam etmek için bir tuşa basn");
            
            scan.nextLine();
            
            notify();
            
            System.out.println("Thread1 uyandırıldı");
            
        }
    }
    
}
