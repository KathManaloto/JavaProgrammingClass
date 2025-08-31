//Write a program that takes in three numbers from the user and outputs the largest number. 
//If all numbers are equal, it will print "All numbers are equal".
package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);    
        try{
            System.out.print("Enter first number : ");
                nums.add(sc.nextInt());
            System.out.print("Enter second number: ");
                nums.add(sc.nextInt());
            System.out.print("Enter third number : ");
                nums.add(sc.nextInt());

            if(nums.get(0).equals(nums.get(1)) && nums.get(0).equals(nums.get(2))) 
                System.out.println("All numbers are equal");
            else System.out.println("Largest number: " + Collections.max(nums));
            
        } catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter integers only.");
        }
    }
}
