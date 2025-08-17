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

    /* Half Pyramid Pattern with Numbers */

    public static void numbersHalfPyramidPattern (int rows) {

        /* Outer Loop -> Rows */
        for (int i = 1; i <= rows; i++) {
            
            /* Inner Loop -> Numbers */
            for (int j = 1; j <= rows - i + 1; j++) {
                
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /* Floyds Triangle */

    public static void floydsTriangle (int rows) {

        int num = 1;
        /* Outer loop -> Rows */
        for(int i = 1; i <= rows; i++) {

            /* Inner loop for number and column */
            for(int j = 1; j <= i; j ++) {

                System.out.print(num + " ");
                num ++;
            }
            System.out.println();
        }
    }

    /* 0 1 Triangle Pattern */

    public static void zeroOneTrianglePattern (int rows) {

        /* Outer lopp -> Rows */
        for(int i = 1; i <= rows; i++) {

            /* Inner loop -> Columns */
            for(int j = 1; j <= i; j++) {

                /* Only print 1 if the position of the Matrix is Even */
                if ((i + j) % 2 == 0) {
                    System.err.print("1 ");
                }
                else {
                    System.err.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterFly (int rows) {
        /*
        Upper Half
         Outer loop -> Rows */
        for (int i = 1; i <= rows; i++) {

            /* Stars */
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            /* Spaces */
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }

            /* Stars */
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        /*
        Lower Half (Mirror)
         Outer loop -> Rows */
        for (int i = rows; i >= 1; i--) {

            /* Stars */
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            /* Spaces */
            for (int j = 1; j <= 2 * (rows - i); j++) {
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
        // invertedHalfPyramidPattern(4);
        // numbersHalfPyramidPattern(5);
        // floydsTriangle(5);
        // zeroOneTrianglePattern(5);
        butterFly(4);

    }

}
