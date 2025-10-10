// To find the maximum sum of an SubArray
import java.util.*;
public class MaxSubArray {

    public static void Kadanes (int numbers []) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int negativeCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeCount ++;
            }
        }

        if (negativeCount == numbers.length) {
            for (int i = 0; i < numbers.length; i++) {
                currentSum = Math.max(numbers[i], currentSum + numbers[i]);
                maxSum = Math.max(maxSum, currentSum);
                
            }
        } else {

            for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];

            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }
        
            
        }
        

        System.out.println("The Max Sum of the SubArray is " + maxSum);
    }

    public static void preFixmaxSubArray(int numbers[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int preFixArray [] = new int [numbers.length];

        preFixArray[0] = numbers[0];
        // Prefix Array
        for (int i = 1; i < numbers.length; i++) {
            preFixArray[i] = preFixArray[i - 1] + numbers[i];
        }


        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                
                currentSum = start == 0 ? preFixArray[end] : preFixArray[end] - preFixArray[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            
        }
         System.out.println("Total Maximum sum of SubArray = " + maxSum);
    }

    public static void maxSubArray(int numbers[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }
                System.out.println("Current Sum is " + currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
         System.out.println("Total Maximum sum of SubArray = " + maxSum);
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10 };
        int numbers2[] = {1,-2,6,-1,3};
        int numbers3[] = {-2,-3,4,-1,-2,1,5,-3};
        int numbers4[] = {-2,-3,-5,-6,-2,-1};

        // maxSubArray(numbers2);
        // preFixmaxSubArray(numbers2);
        // Kadanes(numbers3);
        Kadanes(numbers3);


    }
    
}
