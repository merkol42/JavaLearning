/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiLock;

/**
 *
 * @author merkol
 */
public class Main {
    public static void main(String[] args) {
        ListWorker worker = new ListWorker();
        
        long start = System.currentTimeMillis();
        
        worker.startThread();
        
        long end = System.currentTimeMillis();
        
        System.out.println("Elapsed time : " + (end - start));
    }
}
