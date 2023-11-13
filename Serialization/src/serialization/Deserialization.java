/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class Deserialization {
    
    public static void deserialize() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.bin"))) {
            Student student = (Student)in.readObject();
            Student student1 = (Student)in.readObject();
            
            System.out.println(student);
            System.out.println(student1);
        } catch (FileNotFoundException ex) {
            System.out.println("not found e");
        } catch (IOException ex) {
            System.out.println("IO e");
        } catch (ClassNotFoundException ex) {
            System.out.println("object not found e");
        } 
    }
}
