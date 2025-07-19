package matrices;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter number of rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int c1 = sc.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter number of rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int c2 = sc.nextInt();

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            System.out.println("Number of columns in Matrix A must equal number of rows in Matrix B.");
            sc.close();
            return;
        }

        // Declare matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // Input elements of Matrix A
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input elements of Matrix B
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
