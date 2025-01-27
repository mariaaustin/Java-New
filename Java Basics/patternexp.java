public class patternexp {

    public static void main(String[] args) {
        int n = 5;
        for (int row = 5; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
    }
}
