import java.util.*;
public class Pairs {

    public static void countPairs (int numbers []){

        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + ", " + numbers[j] + ") ");
                totalPairs ++;
            }
            System.out.println();
        }
        System.out.println("The total pairs of the array are " + totalPairs);
    }
    
    public static void main (String args[]) {

        int numbers [] = {2,4,6,8,10};

        countPairs(numbers);

    }
}
