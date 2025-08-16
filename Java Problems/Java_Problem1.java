import java.util.Scanner;

public class Java_Problem1 {
    
    public static void main (String args []) {

        Scanner Scn = new Scanner(System.in);

        System.out.print("Enter the price of pencil : ");
        float pencil = Scn.nextFloat();

        System.out.print("Enter the price of pen : ");
        float pen = Scn.nextFloat();

        System.out.print("Enter the price of eraser : ");
        float earser = Scn.nextFloat();

        float total = pencil + pen + earser;
        
        float totalBill = (18/100f * total) + total;
        float gst = (18/100f * total) ;

        System.out.print("Your total amount (excluding gst) : ");
        System.out.println(total);
        
        System.out.print("Gst is : ");
        System.out.println(gst);

        System.out.print("Total including Gst is : ");
        System.out.println(totalBill);

        Scn.close();
    }
}
