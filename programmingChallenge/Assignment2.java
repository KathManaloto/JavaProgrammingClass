//Number to month(1-12) and print number of days of that month
package programmingChallenge;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will display the number of days for a specific month entered by the user...\n");
        System.out.print("Enter the month number (1 = January, 2 = February, ..., 12 = December): ");

        if (sc.hasNextInt()) {
            int monthNumber = sc.nextInt();

            switch (monthNumber) {
                case 1: System.out.println("No. of days for the month of January: 31\n");
                        break;
                case 2: System.out.println("No. of days for the month of February: 28 (29 in a leap year)\n");
                        break;
                case 3: System.out.println("No. of days for the month of March: 31\n");
                        break;
                case 4: System.out.println("No. of days for the month of April: 30\n");
                        break;
                case 5: System.out.println("No. of days for the month of May: 31\n");
                        break;
                case 6: System.out.println("No. of days for the month of June: 30\n");
                        break;
                case 7: System.out.println("No. of days for the month of July: 31\n");
                        break;
                case 8: System.out.println("No. of days for the month of August: 31\n");
                        break;
                case 9: System.out.println("No. of days for the month of September: 30\n");
                        break;
                case 10: System.out.println("No. of days for the month of October: 31\n");
                         break;
                case 11: System.out.println("No. of days for the month of November: 30\n");
                         break;
                case 12: System.out.println("No. of days for the month of December: 31\n");
                         break;
                default: System.out.println("Invalid input! Please enter an integer from 1-12\n");
            }
        } else System.out.println("Invalid input! Please enter an integer from 1-12\n");

        sc.close();
    }
}
