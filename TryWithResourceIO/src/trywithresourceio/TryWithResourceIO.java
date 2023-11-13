/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trywithresourceio;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author merkol
 */
public class TryWithResourceIO {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(new BufferedReader(new FileReader(deneme.txt)) // read with buffer >> perf
        try (Scanner scan = new Scanner(new FileReader("deneme.txt"))) { // closable class fw
            while (scan.hasNextLine())
                System.out.println(":: -> " + scan.nextLine());
        } catch (IOException e) {
            System.out.println("Dosya oluşturulamadı! | Açılamadı");
        }
    }
    
}
