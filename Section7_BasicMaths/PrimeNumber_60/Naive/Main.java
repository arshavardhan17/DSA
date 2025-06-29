package Section7_BasicMaths.PrimeNumber_60.Naive;

public class Main {
    public static boolean isPrime(int n){
        for (int i=0 ;i<n;i++){
            if(n%i ==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}