//Score to Grade F-A: This program will output the grade of the students based on their test scores. 
package programmingChallenge;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter test score: ");

        if(sc.hasNextInt()){

            int score = sc.nextInt();

            if (score < 0 || score > 100) System.out.println("Invalid input!\n");
            else if (score < 60) System.out.println("Grade: F\n");
            else if (score < 70) System.out.println("Grade: D\n");
            else if (score < 80) System.out.println("Grade: C\n");
            else if (score < 90) System.out.println("Grade: B\n");
            else System.out.println("Grade: A\n");
            
        } else System.out.println("Invalid input!\n");
        
        sc.close();
    }
}