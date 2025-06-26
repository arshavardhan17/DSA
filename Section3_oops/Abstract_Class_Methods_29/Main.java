package Section3_oops.Abstract_Class_Methods_29;
abstract class car{
    int numOfWheels;
    abstract void startEngine();
}
class Honda extends car{  
    void startEngine(){  // we cannot craete honda class without Statrt engine method
        System.out.println("engine Started"); 
    }

}
public class Main {
    public static void main(String[] args) {
        Honda city=new Honda();
        city.numOfWheels=6; 
        city.startEngine(); 

     //   car car =new car(); // to stop creating car object use Abstarct
    }
}
