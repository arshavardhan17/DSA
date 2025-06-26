//memory alloation is contiguous
// Arrays in Java are used to store multiple values of the same type in a single variable.

package Arrays_12_13_14;

public class Array {
    public static void main(String[] args) {
        // Example of declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};
        // Alternatively, you can declare an array and then initialize it
        // int[] numbers = new int[5];

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modifying an element in the array
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]);

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Looping through the array
        System.out.print("All elements in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


    }
}
