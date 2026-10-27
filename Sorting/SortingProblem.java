package Sorting;

import java.util.*;

public class SortingProblem {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minPos]) {
                    minPos = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int currentValue = arr[i];
            int prevIndex = i - 1;

            while (prevIndex >= 0 && currentValue > arr[prevIndex]) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex + 1] = currentValue;
        }
    }

    public static void countingSort(int arr[]) {

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }

        int countArray[] = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        int j = 0;
        for (int i = countArray.length - 1; i >= 0; i--) {
            while (countArray[i] > 0) {
                arr[j] = i;
                j++;
                countArray[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String args[]) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        countingSort(arr);
        printArray(arr);

    }

}
