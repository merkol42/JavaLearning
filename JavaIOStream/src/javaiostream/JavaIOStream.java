/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author merkol
 */
public class JavaIOStream {
    
    public static void fileInput() {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("dosya.txt");
            fis.skip(8); // file* + 8
            while (fis.available() > 0)
                System.out.print((char)fis.read());
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.out.println("Okuma hatası!");
        }
        finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken hata!");
            }
        }
    }
    
    
    public static void fileOutput() {
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("dosya.txt", true); // (file)default trunc mode || (file, true) append mod
            fos.write(65);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception!!");
        } catch (IOException e) {
            System.out.println("IOException!!!");
        }
        finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("File Close Exception!");
            }
        }
    }
    
    public static void main(String[] args) {
        fileInput();
        fileOutput();
    }
    
}
