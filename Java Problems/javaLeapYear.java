import java.util.*;
public class javaLeapYear {
    public static void main (String args[]) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter the year you want to check: ");
        int year = Scn.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year!");
                } else {
                    System.out.println(year + " is not a leap year!");
                }
            } else {
                System.out.println(year + " is a leap year!");
            }
        } else {
            System.out.println(year + " is not a leap year!");
        }

        Scn.close();
    }
}
