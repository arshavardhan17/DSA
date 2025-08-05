package Basic_DS_18_19_20;

import java.util.*;

public class Sets {
    // Hashset is a DS that stores unique elements in any random order
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
}
// output
// [1,2,3,4]