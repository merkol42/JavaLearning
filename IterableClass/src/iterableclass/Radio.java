/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterableclass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author merkol
 */
public class Radio implements Iterable<String>{

    private ArrayList<String> arrayList = new ArrayList<>();

    public Radio(String[] channels) {
        for (String s : channels)
            arrayList.add(s);
    }
    
    @Override
    public Iterator<String> iterator() {
        return arrayList.iterator();
    }
}
