package Data_Types_4.Non_Primitive;

public class Strings {
    public static void main(String[] args) {
        String name ="Arsha";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(1, 4));
        System.out.println(name.concat("Reddy"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.equals("Arsha"));
        System.out.println(name.equalsIgnoreCase("arsha"));
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.endsWith("sha"));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.replace('a', 'o'));
        System.out.println(name.contains("rs"));
        System.out.println(name.isEmpty());
        System.out.println(name.trim());
        System.out.println(name.repeat(2));
        System.out.println(name.compareTo("Arsha"));
        System.out.println(name.compareToIgnoreCase("arsha"));
        System.out.println(name.getBytes().length);
        System.out.println(name.toCharArray().length);
    }
    
}
