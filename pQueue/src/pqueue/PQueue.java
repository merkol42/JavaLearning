/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author merkol
 */
public class PQueue {

    public static void main(String[] args) {
        
//        Queue<Integer> pQueue = new PriorityQueue<>();
//        
//        pQueue.offer(123);
//        pQueue.offer(0);
//        pQueue.offer(1);
//        pQueue.offer(42);
//        
//        for (Integer i : pQueue) {
//            System.out.println(i);
//        }
//        
//        while (!pQueue.isEmpty())
//            System.out.println("Val : " + pQueue.poll());

        Queue<Patient> pq = new PriorityQueue<>();
        
        
        pq.offer(new Patient("Mete", "Migren", 2));
        pq.offer(new Patient("Apoli", "MigrenDeğil", 3));
        pq.offer(new Patient("Oğuz", "Mide", 0));
        pq.offer(new Patient("Cahil", "Apandisit", 1));

        
        for (Patient i : pq) {
            System.out.println(i);
        }
        
        while (!pq.isEmpty())
            System.out.println("Val : " + pq.poll());
    }
    
}
