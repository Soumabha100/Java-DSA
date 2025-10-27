// Trapping Maximum Rainwater
import java.util.*;

public class TrappingRainWater {

    public static int TrappedRainWater(int height[]) {
        int n = height.length;
        int trappedWater = 0;
        int leftMaxBoundary[] = new int[n];
        int rightMaxBoundary[] = new int[n];

        if (n <= 2) {
            System.out.println("Edge Case 2");
            return 0;
        }

        else {

            // Left Max Boundary
            leftMaxBoundary[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i - 1]);
            }

            // Right Max Boundary
            rightMaxBoundary[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
            }

            for (int i = 0; i < n; i++) {
                int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
                trappedWater += waterLevel - height[i];
            }

            
            return trappedWater;
        }

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int height2[] = { -1, -2, -3, -4, -5, -6 };
        int h3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 4, 4, 2, 8 };
        int h4[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int h5[] = { 1, 2 };
        int h6[] = { 4, 2, 0, 3, 2, 5 };

        int result = TrappedRainWater(h6);

        for (int i = 0; i < h6.length; i++) {
            System.out.print(h6[i] + " ");
        }

        System.out.println("The trapped water is " + result);
    }
}
