package Java_Patterns;

public class hollowPattern {

    /* Hollow Rectangle pattern */
    public static void hollowRectangle(int rows, int colms) {

        /* Outer Loop -> Rows */
        for (int i = 1; i <= rows; i++) {

            /* Inner loop -> Columns */
            for (int j = 1; j <= colms; j++) {

                /* Edge Condition for the Hollow pattern */
                if (i == 1 || i == rows || j == 1 || j == colms) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /* Inverted Half Pyramid Pattern */

    public static void invertedHalfPyramidPattern (int rows) {

        /* Outer loop -> Rows */
        for (int i = 1; i <= rows; i++) {
            
            /* Spaces */
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            /* Stars */
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void main(String args[]) {

        // hollowRectangle(4, 5);
        invertedHalfPyramidPattern(4);

    }

}
