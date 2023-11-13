/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread2;

/**
 *
 * @author merkol
 */
public class Printer implements Runnable {
    private String  name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("printer run()");
        
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(this.name + " -> sa");
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupt e");
            }
        }
    }
    
}
