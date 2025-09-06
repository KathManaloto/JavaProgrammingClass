//This program will output multiple StringBuilder operations...
//StringBuilder - 10 characters
package programmingChallenges;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {

        System.out.println("\nThis program will output multiple StringBuilder operations...\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (at least 10 characters): ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        if (input.length() >= 10) {
            System.out.println("\nOUTPUT: ");
            System.out.println("Length of String   : " + sb.length());
            System.out.println("First character    : " + sb.charAt(0));
            System.out.println("Last character     : " + sb.charAt(sb.length() - 1));
            System.out.println("Index of first 'a' : " + sb.indexOf("a"));
            System.out.println("Substring [3-6]    : " + sb.substring(3, 7));
            System.out.println("Append '123'       : " + sb.append("123"));
            System.out.println("Insert 'xyz' at [4]: " + sb.insert(4, "xyz"));
            System.out.println("Delete substg [2-4]: " + sb.delete(2, 5));
            System.out.println("Delete char of [8] : " + sb.deleteCharAt(8));
            System.out.println("Reverse the string : " + sb.reverse() + "\n");
        } else
            System.out.println("Input should be at least 10 characters!");

        sc.close();
    }
}