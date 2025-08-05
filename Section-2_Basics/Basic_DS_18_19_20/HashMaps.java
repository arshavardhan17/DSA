package Basic_DS_18_19_20;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "arsha");
        map.put(2, "vishnu");
        map.put(3, "asdfdf");
        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(2));// gives you value for that key
        map.size();// Gives you size of the hashmap
    }
    // if you put duplicate keys the value will be over riden

}
