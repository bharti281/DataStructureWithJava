package Apna_College;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("Us",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);
        if(map.containsKey("china")){
            System.out.println("Present in the map");
        }
        else {
            System.out.println("Key not present in a map");
        }
        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key :keys){
            System.out.println(key + " "+map.get(key));
        }

        map.remove("china");
        System.out.println(map);




    }
}
