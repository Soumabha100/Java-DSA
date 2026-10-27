package Sorting;

import java.util.*;

public class BasicSorting {

    public static void bubbleSort(int arr[]) {

        // No. of turns
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // No. of checks and swaps
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap Logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }

                int temp = arr[minPosition];
                arr[minPosition] = arr[i];
                arr[i] = temp;
            }

        }
    }

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int currentValue = arr[i];
            int prevIndex = i - 1;

            while (prevIndex >= 0 && arr[prevIndex] > currentValue) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex + 1] = currentValue;
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String args[]) {

        Integer arr[] = { 5, 4, 1, 3, 2 };

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }

}
