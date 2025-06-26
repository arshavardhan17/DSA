package Arrays_12_13_14;
public class Array_Imp {
    public static void main(String[] args) {
       
 //finding the index of first and last occurence of an element in an array

        int[] arr = {1, 2, 3, 4, 5, 3, 6, 3};
        System.out.println("First occurrence of 3: " + findFirstOccurrence(arr, 3));
        System.out.println("Last occurrence of 3: " + findLastOccurrence(arr, 3));
    }

    // Method to find the first occurrence of an element
    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Method to find the last occurrence of an element
    public static int findLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }
}
