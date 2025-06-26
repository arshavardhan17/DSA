package Basic_DS_18_19_20;
import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
         map.put(1,"arsha");
         map.put(2, "vishnu");
         map.put(3, "asdfdf");

         System.out.println(map.get(3));
    }
   //if you put duplicate keys the value will be over riden 

}
