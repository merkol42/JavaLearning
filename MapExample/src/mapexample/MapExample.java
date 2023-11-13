/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapexample;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author merkol
 */
public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Word Freq");
        
        System.out.println("Metin giriniz : ");
        String text = scanner.nextLine();
        
        Map<Character, Integer> freq = new TreeMap<>();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (freq.containsKey(c)) {
                freq.replace(c, freq.get(c) + 1);
            }
            else
                freq.put(c, 1);
        }
        
        for (Character key : freq.keySet()) {
            System.out.println(key + " : " + freq.get(key));
        }
    }
    
}
