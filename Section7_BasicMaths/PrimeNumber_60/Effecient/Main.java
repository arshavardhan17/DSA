package Section7_BasicMaths.PrimeNumber_60.Effecient;

public class Main {
    public static boolean isPrime(int n){
        for (int i=0 ;i<=n/2;i++){  //  n/2 chaged no need to chect useles numbers which exceds the number
            if(n%i ==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}