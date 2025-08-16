/*
 * To check whether a number is Palindrome is not using Functions/Methods
 */
import java.util.*;

public class palindromeJava {
    
    public static boolean isPalindrome (int num) {
        int rev_num = 0;
        int ogNum = num;

        while (num > 0) {
            int lastDigit = num % 10;

            rev_num = (rev_num * 10) + lastDigit ;

            num /= 10;
        }

        if (ogNum == rev_num) {
            return true;
        }

        return false;

    }
    public static void main (String args[]) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = Scn.nextInt();

        System.out.println(isPalindrome(n));

        Scn.close();
    }
}
