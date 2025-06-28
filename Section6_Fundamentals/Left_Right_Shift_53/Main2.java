package Section6_Fundamentals.Left_Right_Shift_53;

import java.util.Scanner;
//Task:change the  dcimal number to binary using bitwise
        // System.out.println(1532%10);-->gives you last number
        // System.out.println(1532/10);-->gives you everything except last number
public class Main2 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int num =Sc.nextInt();
        
        int count =0;
        while(num>0){  
           int lastBit=num&1;
            count =count*10+lastBit;
            num=num>>1;
        }
        System.out.println(count);
        Sc.close();
    }
}
