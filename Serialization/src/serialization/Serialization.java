/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author merkol
 */
public class Serialization {
    // transient ve static değerler serileştirilmez
    public static void main(String[] args) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.bin"))) {
            Student student = new Student("Mete", "Software", 1);
            Student student1 = new Student("Apoli", "ban", 2);
            
            out.writeObject(student);
            out.writeObject(student1);

            
        } catch (FileNotFoundException ex) {
            System.out.println("fnfound exp");
        } catch (IOException ex) {
            System.out.println("ioexp");
        }
        
        Deserialization.deserialize();
        
        try (Scanner scan = new Scanner(new FileReader("student.bin"))) { // closable class fw
            while (scan.hasNextLine())
                System.out.println(":: -> " + scan.nextLine());
        } catch (IOException e) {
            System.out.println("open error");
        }
    }
    
}
