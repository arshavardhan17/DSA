package Section3_oops.Interfaces_30;
interface Iperson{  //Everything should be Abstract
    int age=0;
    String name=null;
    boolean canVote();
    boolean Anything();
}
interface IAnother{
    int getSum(int a,int b);
}
class person implements Iperson,IAnother{//we can implement more than one interface
 public boolean canVote(){ //we cannot create an class withou creating metods of implemented interface
    return false;
 };

 public boolean Anything(){
    return true;
 }

 public int getSum(int a,int b){
   return 0;
 }
}
public class Main {
   public static void main(String[] args) {
    
   } 
}
