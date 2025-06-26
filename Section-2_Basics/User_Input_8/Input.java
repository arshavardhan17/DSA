package User_Input_8;

// Import the Scanner class
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        
        // Read a line of text from the user  you can also use next() to read a single word
        String name = scanner.nextLine();
        //for integer input, you can use nextInt()
        //for float input, you can use nextFloat()
        //for double input, you can use nextDouble()
        //for boolean input, you can use nextBoolean()
        //for character input, you can use next().charAt(0) to read a single character
        //for string input, you can use nextLine() to read a full line of text
        
        
        // Print the input back to the user
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        scanner.close();
    }
    
}
