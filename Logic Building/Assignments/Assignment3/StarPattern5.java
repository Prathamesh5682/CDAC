public class StarPattern5 {
    public static void main(String[] args) {
        int n = 5; // Number of lines

        // Outer loop to handle the number of lines
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to center the stars
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing the stars
            System.out.println();
        }
    }
}
