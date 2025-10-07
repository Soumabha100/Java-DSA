import java.util.*;

public class Arrays {
    
    public static int LinearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 5, 8, 12, 14, 19, 21, 29 };
        int key = 8;

        int index = LinearSearch(numbers, key);

        if (index == -1) {
            System.out.println("The value does not exists");
        } else {

            System.out.println("The value " + key + " is found at " + index);
        }

    }
}
