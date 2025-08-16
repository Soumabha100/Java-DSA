import java.util.*;

public class javaCalculator {
    public static void main (String args[]) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = Scn.nextInt();

        System.out.print("Enter the value of b : ");
        int b = Scn.nextInt();

        System.out.print("Enter the operator : ");
        char Operator = Scn.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("Invalid Operator!");
                break;
        }

        Scn.close();
    }
}
