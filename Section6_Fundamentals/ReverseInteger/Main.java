package Section6_Fundamentals.ReverseInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        sc.close();
        int result =0;
        while(number>0){
            int lastDigit=number%10;
            // if(result<Integer.MIN_VALUE/10||result>Integer.MAX_VALUE/10){ //if integer value exceded return 0
            //     return 0;
            // }
            result =result*10+lastDigit; //it adds a zero at last and replace it with last digit
            number=number/10;
        }
        System.out.println(result);
    }
}
