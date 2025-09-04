//Odd or even? Positive or negative? or Zero? 
package programmingChallenges;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will determine if a certain number is: \n - Odd or Even\n - Positive or Negative\n - Zero");
        System.out.print("Enter an integer: ");

        if (sc.hasNextInt()) {
            int checkNum = sc.nextInt();
            System.out.println("\nRESULTS: ");
            System.out.println("Number: " + checkNum);
            oddEvenChecker(checkNum);
            signChecker(checkNum);
            System.out.println();
        } else System.out.println("\nInvalid input! Please enter integers only.\n");
        sc.close();
    }

    public static boolean oddEvenChecker(int num) {
        if (num % 2 == 0) {
            System.out.println("Parity: Even");
            return true;
        } else {
            System.out.println("Parity: Odd");
            return false;
        }
    }

    public static void signChecker(int num) {
        if (num > 0) System.out.println("Sign: Positive");
        else if (num < 0) System.out.println("Sign: Negative");
        else System.out.println("Sign: Zero (neutral)");
    }
}