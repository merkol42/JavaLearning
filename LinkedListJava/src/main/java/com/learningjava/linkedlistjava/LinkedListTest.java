package com.learningjava.linkedlistjava;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author merkol
 */
public class LinkedListTest {

    public static void printList(LinkedList<String> gidilecek_yerler) {
        
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()) {
            
            System.out.println(iterator.next());
                
        }
        
      
    }
    public static void listAddBack(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while (iterator.hasNext()) {
            
            int karsilastir = iterator.next().compareTo(yeni);
            
            if (karsilastir == 0) {
                // İki değer eşit
                System.out.println("Listeniz bu eleman zaten var....");
                
                return;
               
            }
            else if (karsilastir  < 0) {
                
                // Yeni değer iterator.next ten daha büyük.
            }
            else if (karsilastir > 0 ) {
                
                iterator.previous();
                iterator.add(yeni);
                
                return;
                
            }
           
        }
        iterator.add(yeni);
        
    }
    
    public static void procc() {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("Ankara");
        lst.add("Eskişehir");
        lst.add("Kocaeli");
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> iter = lst.listIterator();
        while (true) {
            int opt = scanner.nextInt();
            
            switch (opt) {
                case 1: // ileri
                    if (iter.hasNext()) {
                        System.out.println(iter.next());
                    }
                    break;
                case 2:
                    if (iter.hasPrevious()) {
                        iter.previous();
                        System.out.println(iter.previous());
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
    
    public static void main(String[] args) {
        procc();
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        
        
        listAddBack(gidilecek_yerler, "Postane");
        listAddBack(gidilecek_yerler, "Market");
        listAddBack(gidilecek_yerler, "Ev");
        
        
        LinkedList<String> lst = new LinkedList<>();
        lst.add("Han");
        ListIterator<String> iter = lst.listIterator();
        System.out.println(iter);
        if (iter.hasNext())
            System.out.println("Next var");
        else
            System.out.println("Next yok");
        printList(lst);
        System.out.println("öncesi yukarı");
//        iter.previous();
        iter.add("Mete");
//        iter.previous();
//        iter.add("xd");
        
        printList(lst);
        
//        printList(gidilecek_yerler);
    }
}
