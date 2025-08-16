import java.util.*;

public class javaTables {

    public static void main (String args[]) {

       Scanner Scn = new Scanner(System.in);

       System.out.print("Enter the number : ");
        int n = Scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }

       Scn.close();
    }
    
}
