package Section3_oops.Getters_Setters_25;
class person {
 private String name;
 private int age;

 void SetName(String name){ //setter
    this.name=name;
 }
 void SetAge(int age){
    this.age=age;
 }
 
 String GetName(){         //Getter
    return this.name;
 }
  
 int GetAge(){
    return this.age;
 }
}
public class Main {
    public static void main(String[] args) {
        person arsha =new person();
        System.out.println(arsha.GetName());
        System.out.println(arsha.GetAge());
    }
}
//Acces modifiers:-public private protected 