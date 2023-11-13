/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiLock;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class ListWorker {

    Random rand = new Random();

    ArrayList<Integer> lst1 = new ArrayList<>();
    ArrayList<Integer> lst2 = new ArrayList<>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();
    
    public void assignValue1(ArrayList<Integer> lst) {
        
        synchronized(lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println("interrupt e");
            }
            lst.add(rand.nextInt(100));
        }
    }

    public void assignValue2(ArrayList<Integer> lst) {

        synchronized(lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println("interrupt e");
            }
            lst.add(rand.nextInt(100));
        }
    }
    
    public void initLists() {

        for (int i = 0; i < 1000; i++) {
            assignValue1(lst1);
            assignValue2(lst2);
        }
    }

    public void startThread() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                initLists();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                initLists();
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println("interrupt e");
        }

        System.out.println("lst1 size : " + lst1.size() + "\nlst2 size : " + lst2.size());
    }

}
