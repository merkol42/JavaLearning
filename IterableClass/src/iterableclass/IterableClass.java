/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterableclass;

/**
 *
 * @author merkol
 */
public class IterableClass {

    public static void main(String[] args) {
        String[] arr = {"Zaa", "AlemFm", "Kral"};
        
        Radio rd = new Radio(arr);
        
        for (String s : rd) {
            System.out.println(s);
        }
    }
    
}
