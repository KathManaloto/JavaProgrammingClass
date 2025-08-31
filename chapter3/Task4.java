//This program will check if a string is a palindrome or not
package chapter3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        
        System.out.println("\nThis program will check if a string is a palindrome or not...");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a String (word,number, or sequence of characters): ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
            
        System.out.println((sb.toString().equals(sb.reverse().toString())) ? "The input string is a palindrome." : "The input string is not palindrome.") ;
        sc.close();
    }
}