import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half including middle line
        for (int i = 0; i < n; i++) {
            // leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // first star
            System.out.print("*");
            if (i > 0) {
                // inner spaces
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                // second star
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            // leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // first star
            System.out.print("*");
            if (i > 0) {
                // inner spaces
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                // second star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *

    }
}
