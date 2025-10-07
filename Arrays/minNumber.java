// To Find the Smallest Numbers in an Array

import java.util.*;
public class minNumber {

    public static int findSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    
    public static void main (String args []){
        int numbers [] = {1,2,6,3,5,29};

        System.out.println("The smallest number in the array is " + findSmallest(numbers));
    }
}
