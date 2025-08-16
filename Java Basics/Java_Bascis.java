import java.util.*;

public class Java_Bascis {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }

    public static int Product (int x, int y) {
        int product = x * y ;
        return product;
    }

    public static int Factorial (int n) {
        int Fact = 1;

        for(int i = 1; i <= n; i++) {
            Fact = Fact * i;
        }

        return Fact;
    }

    public static int BinCoffe (int n, int r) {
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial(n - r);

        return n_fact / (r_fact * nmr_fact);
    }

    public static boolean isPrime (int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void inRangeIsPrime (int n) {

        for(int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void toDecimal (int binNum) {

        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum /= 10;
        }

        System.out.println("The Decimal of " + myNum + " is " + decNum);
    }

    public static void toBinary (int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int lastDigit = decNum % 2;

            binNum = binNum + (lastDigit * (int)Math.pow(10, pow));

            pow++;
            decNum /= 2;
        }

        System.out.println("The Binary of " + myNum + " is " + binNum);
    }

    public static void main(String args[]) {

        Scanner Scn = new Scanner(System.in);

        // System.out.print("Enter the value of Factorial ");
        // int n = Scn.nextInt();

        // int f = Factorial(n);

        // System.out.println(isPrime(7));
        // inRangeIsPrime(29);

        toDecimal(100101);
        toBinary(15);

        Scn.close();
    }
}