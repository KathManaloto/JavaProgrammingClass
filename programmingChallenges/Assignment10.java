//Count number of words in an input
package programmingChallenges;

import java.util.Scanner;

public class Assignment10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will count the number of words in a sentence or phrase...");
        System.out.print("Enter a sentence: ");

        String input = sc.nextLine();

        if(!input.isEmpty()){
            String[] words = input.trim().replaceAll("[^a-zA-Z\\s]","").split("\\s+");
            System.out.println("Word count: " + words.length + "\n");
        } else System.out.println("Empty input!");
        sc.close();
    }
}