//multiplication table 10x10
package programmingChallenges;

public class Assignment7 {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        // fill the multiplication table values
        System.out.println("\n\tMULTIPLICATION TABLE (10x10)");
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                table[row][col] = (row + 1) * (col + 1);
                // System.out.print(table[row][col] + "\t");
                System.out.printf("%4d", table[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
}