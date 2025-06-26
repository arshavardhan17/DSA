package Basic_DS_18_19_20;

import java.util.*;

public class Sets {
    //set is an array without duplicates
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
}
//output
//[1,2,3,4]