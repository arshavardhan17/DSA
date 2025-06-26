package Dynamic_Array_16;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
    List <Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(10);
    list.add(20);
    list.add(25);

    //loop over list
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }

    //for each
    for(int x:list){
        System.out.println(x);
    }
    //print direct
    System.out.println(list);
}
}