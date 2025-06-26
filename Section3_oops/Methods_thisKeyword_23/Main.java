package Section3_oops.Methods_thisKeyword_23;
class person{
    String name;
    int age;
    //methods 
    void speak(String whatToSay){
        System.out.println(name+" "+ whatToSay);
    }

    void walk(){
        System.out.println(name +"is walking");
    }
}
public class Main {
    public static void main (String[] args) {
        person Arsha =new person();//creating two objects with single class 
        person Vishnu =new person();

        Arsha.name="arsha";
        Vishnu.name="vishnu";

        Arsha.walk();
        Vishnu.walk();

        Arsha.speak( "i am learning java ");


    }
}
