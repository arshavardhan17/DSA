package Section3_oops.Introduction_21;
class Animal {
    String breed;
    String color;
    String name;
    int age;
}
class person{
    String name;
    String nat;
    int age;
}
public class Main {
    public static void main(String[] args) {
        Animal dog=new Animal();
        Animal Lion=new Animal();
        dog.name="Tuffy";
        dog.age=12;
        dog.breed="lab";

        Lion.name="Lion";
        Lion.age=13;
        Lion.breed="lion";

        System.out.println(dog.name);

    }
    
}
