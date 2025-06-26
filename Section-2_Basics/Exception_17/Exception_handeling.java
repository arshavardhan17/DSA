package Exception_17;

import java.util.*;

public class Exception_handeling {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();
        sc.close();
        int[]arr=new int[4];
        try {
         System.out.println(a/b);
         arr[5]=10;
        } catch (ArithmeticException e) {
            System.out.println("an exception occured"+e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("an exception occured"+e);
        }
       
    }
    
}
//to catch all types of exceptions use Exception e 