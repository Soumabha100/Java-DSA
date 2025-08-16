import java.util.*;

public class factorialJava {
    public static void main(String args[]) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = Scn.nextInt();

        if (n < 0) {
            System.out.println("Factorial is invalid for negative numbers");
        } else {

            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial is " + factorial);
        }

        Scn.close();
    }
}
