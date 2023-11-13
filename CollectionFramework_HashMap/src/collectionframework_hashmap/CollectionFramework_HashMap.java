/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionframework_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author merkol
 */
public class CollectionFramework_HashMap {

    
    public static void printmap(Map<Integer, String> map) {
        map.put(5, "C++");
        map.put(10, "Java");
        map.put(15, "Python");
        map.put(20, "JS");
        map.put(25, "Rust");
        
        for (Map.Entry<Integer, String> pair : map.entrySet()) { // for (Integer key : map.keySet()) {sout("key+map.get(key)")}
            System.out.println("Key : " + pair.getKey() + " Value : " + pair.getValue());
        } 
        System.out.println("-**********************************-");
        
        // Collection<String> values = map.values(); tüm valuelar
    }
    
    
    public static void hashMapLinkedMapTreeMap() {
        Map<Integer, String> hmap = new HashMap<>();
        Map<Integer, String> lnkd_hmap = new LinkedHashMap<>();
        Map<Integer, String> tree_map = new TreeMap<>();
        
        printmap(hmap);
        printmap(lnkd_hmap);
        printmap(tree_map);
    }
    
    
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        
        hmap.put(1, "C++");
        hmap.put(2, "Mete");
        hmap.put(5, "Deneme");
        
        hmap.put(5, "Güncellendi");
        System.out.println(hmap);
        
//        for (Map.Entry<Integer, String> pair : hmap.entrySet()) {
//            System.out.println("Key : " + pair.getKey() + " Value : " + pair.getValue());
//        }
        hashMapLinkedMapTreeMap();
    }
    
}
