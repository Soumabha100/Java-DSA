import java.util.*;

public class primeJava {
    public static void main (String args[]) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = Scn.nextInt();

        boolean isPrime = true;

        if (n == 2) {

            System.out.println(n + " is a prime number!");
        } else {

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) { // n is a multiple of i (i not equals to n or 1)
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number!");
            } else {
                System.out.println(n + " is a not a prime number");
            }
        }

        Scn.close();

    }
}
