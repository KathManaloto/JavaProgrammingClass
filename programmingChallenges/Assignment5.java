//This program will calculate the sum of all integer inputs
package programmingChallenges;

import java.util.*;

public class Assignment5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("\nThis program will calculate the sum of all integer inputs...");
        System.out.println("\nHOW TO USE? \nYou may input all the numbers that you want to add.");
        System.out.println("Once done, simply type \"add\" to get their sum...\n");

        while (true) {
            System.out.print("Enter a number (or type 'add' to get their sum): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("add")) {
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println("Sum: " + sum);
                break;
            } else{
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please only enter integers or type 'add' to get the sum of the numbers.");
                }
            }   
        }
        sc.close();
    }
}

        