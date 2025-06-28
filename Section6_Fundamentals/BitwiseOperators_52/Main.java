package Section6_Fundamentals.BitwiseOperators_52;

import java.util.*;

public class Main {
    //Task:find the number is odd or even usincg bitwise operator (without %)
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
      
        int num =Sc.nextInt();

        if((num & 1)==0){  //gives you last digit 
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }

        Sc.close();
    }
    
}
