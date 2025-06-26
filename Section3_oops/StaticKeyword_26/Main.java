package Section3_oops.StaticKeyword_26;

class person{
  String name;
 static int age; //Static variable
 static int getAge(){ //static method
  return age; //you cannot return this.age in static method
 }
}

public class Main {
  public static void main(String[] args) {
   // person Arsha = new person();
   //person vishnu = new person();

    // Arsha.age=20;     wrong way no errow only warning
    // vishnu.age=40;

    person.age=40;   //we should acces the static variable with class naame 
    System.out.println(person.age);
  }  
}
/*
 * if there is no static variable arsha and vishnu have there own ages (variables) 
 * if there is a static key word there is only one variable which can be accesed or modefied by both objects 
 */

