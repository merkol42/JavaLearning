/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread3;

/**
 *
 * @author merkol
 */
public class Main {
    public static void main(String[] args) {
        
        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printer run()");
        
            for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Printer");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupt e");
            }
            }
            }
        });
        
        printer1.start();
        System.out.println("main thread");
    }
}
