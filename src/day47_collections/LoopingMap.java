package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class LoopingMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("December", 12);
        map.put("April", 4);

        //for( : map) only map doesn't work

        for (String eachKey : map.keySet()) { // iterates through a set of keys
            System.out.println("key - " + eachKey);
            System.out.println("value - " + map.get(eachKey));
        }

        System.out.println();

        for (Integer eachValues : map.values()) { // iterates through all the value
            System.out.println(eachValues);
        }

        System.out.println();

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) { // iterates through all the entries
            //System.out.println(eachEntry);
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
        }

    }
}
