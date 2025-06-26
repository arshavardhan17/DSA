package Arrays_2D_15;

public class Arraya {
    public static void main(String[] args) {
        // Example empty 2D array
// int[][] arr = new int[3][3]; 

        // Initializing a 2D array with values
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        print2DArray(arr);
    }

    // Method to print a 2D array
    public static void print2DArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    } 
}  
    

//output
/*
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 */