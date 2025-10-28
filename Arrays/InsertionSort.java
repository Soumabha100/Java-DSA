import java.util.Arrays;
import java.util.Collections;
// Insertion Sort
public class InsertionSort {

    public static void selectionSort(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
    }

    public static void insertionSort(int array[]){
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int current = array[i];
            int previous = i - 1;

            while (previous >= 0 && array[previous] > current) {
                array[previous + 1] = array[previous];
                previous --;
            }

            array[previous + 1] = current;
        }
    }

    public static void countingSort (int array []) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int count [] = new int [max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String args[]) {
        int array [] = {3,5,4,1,2};
        int array1 [] = {1,4,1,3,2,4,3,7};
        // Arrays.sort(array, 0, 3);
        // insertionSort(array);
        // Arrays.sort(array1, Collections.reverseOrder());
        countingSort(array1);
        printArray(array1);
        
    }
}
