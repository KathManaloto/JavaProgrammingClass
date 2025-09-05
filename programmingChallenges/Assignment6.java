//Integer input from the user and uses a for loop to generate following pattern;
//Pattern not indicated in instructions. Assuming it's a number triangle pattern.
package programmingChallenges;

import java.util.*;

public class Assignment6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will generate a Number Triangle pattern...");
        System.out.print("\nEnter an integer: ");

        int num = sc.nextInt();

        for(int i = 0; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}