package Section3_oops.Constructor_24;

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
    //constructor runs automatically when a object is created 
    person(String name){
        this.name=name;
    }
    // we can create many constructors
    person(){

    }
}
public class Main {
    public static void main (String[] args) {
        //calling parameterised constructor
        person Arsha =new person("arsha"); 
        person Vishnu =new person("vishnu");

        System.out.println(Arsha.name);
        System.out.println(Vishnu.name);
        
        //calling non parameterised constructor
        person Samhith =new person();

        Samhith.name="samhith";
        System.out.println(Samhith.name);

}
}
