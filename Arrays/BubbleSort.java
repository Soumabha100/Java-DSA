// Optimized Bubble Sort
public class BubbleSort {

    public static void Bubble(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println("Optimized Condition is True");
                break;
            }
        }
    }

    public static void PrintArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 5, 3, 2, 4, 1, };
        int numbers2[] = { 1, 2, 3, 4, 5 };
        Bubble(numbers2);
        PrintArray(numbers2);
    }

}