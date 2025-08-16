/* 
Number Conversion from Binary to Decimal and Decimal to Binary using Functions
*/
import java.util.*;

public class conversionJava {

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
        int binNum, decNum ;

        binNum = 1001;
        decNum = 9;

        toDecimal(binNum);
        toBinary(decNum);
        
    }
}
