import java.util.*;
public class SubArrays {

    public static void subArray (int numbers []){

        int totalSubArray = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int sum = 0;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = sum + numbers[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " " + "\n");
                }
                System.out.print("The sum is " + sum + "\n");
                totalSubArray ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays = " + totalSubArray);
    }
    
    public static void main (String args[]) {

        int numbers [] = {2,4,6,8,10};

        subArray(numbers);

    }
}
