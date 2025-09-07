//Sum and average  of input array numbers
package programmingChallenges;

import java.util.*;

public class Assignment12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("\nThis program will calculate the sum and average of input array numbers...");
        System.out.println("\nEnter each number. Then, type 'done' to get the results...");

        while (true) {
            System.out.print("Input number (Type 'done' to get results): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("done")) {
                if(numList.size() == 0){
                    System.out.println("Input is empty.");
                }else{
                    int sum = 0;
                    for (int number : numList) {
                        sum += number;
                    }
                    System.out.println("\nRESULTS: ");
                    System.out.println("Numbers: " + numList);
                    System.out.println("Sum    : " + sum);
                    System.out.println("Average: " + (sum / numList.size()));
                    break;
                }
            } else {
                try {
                    int value = Integer.parseInt(input);
                    numList.add(value);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid input.");
                }
            }
        }
        sc.close();
    }
}