import java.util.*;

public class basicArray {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("Key found at index " + i + " , " + j);
                    return true;
                }

            }
        }

        System.out.println("Key is not found!");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];

        int rows = matrix.length, colums = matrix[0].length;

        Scanner Scn = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

                matrix[i][j] = Scn.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println(" ");
        }

        search(matrix, 5);

        Scn.close();
    }
}
