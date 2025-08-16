import java.util.*;

public class JavaTax {
    public static void main (String args[]) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter your net income : ");
        int income = Scn.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your income is : " + income);
        System.out.println("Your tax is : " + tax);

        Scn.close();

    }
}
