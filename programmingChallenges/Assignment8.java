//String methods
package programmingChallenges;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will output different string methods...");

        System.out.print("\nInput a string: ");
        String stringInput = sc.nextLine();

        System.out.println("\nOUTPUT");
        
        if(!stringInput.isEmpty()){
            System.out.println("String length: " + stringInput.length());             //length
            System.out.println("UpperCase: " + stringInput.toUpperCase());            //uppercase
            System.out.println("LowerCase: " + stringInput.toLowerCase());            //lowercase
            System.out.println("First Character: " + stringInput.charAt(0));                    //first character
            System.out.println("Last Character: " + stringInput.charAt(stringInput.length() - 1));    //last character

            if(stringInput.length() >=5 ) System.out.println("Substring (2nd - 5th): " + stringInput.substring(1, 5) + "\n");
            else System.out.println("Substring (2nd - 5th): Input is too short\n");

        } else System.out.println("Input is empty!\n");
        sc.close();
    }
}