// To Find Duplicate Elements in an Array
public class Problem1 {
    
    public static boolean Duplicate (int numbers []){
        int n = numbers.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Condition Checked");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String args[]) {
        int numbers [] = {1,3,2};
        boolean a = Duplicate(numbers);

        System.out.println(a);
    }
}
