// To find the largest number in an array
import java.util.*;

public class MaxNumber {

    public static int findLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static void main(String args[]) {

        int numbers [] = {1,2,6,3,5,29};

        System.out.println("The largest number in the array is " + findLargest(numbers));
    }
}
