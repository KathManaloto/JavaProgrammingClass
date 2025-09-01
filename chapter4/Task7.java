/* Create a program where user input two numbers and perform 4 basic arithmetic operations using
 * 4 methods with return types and print the results.
 */
package chapter4;

import java.util.*;
import java.text.*;

public class Task7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("\nThis program calculates the sum, difference, product, and quotient of two integers...");
        
        try{
            System.out.print("Enter first number : ");
            double firstNum = sc.nextDouble();
            System.out.print("Enter second number: ");
            double secondNum = sc.nextDouble();

            System.out.println("\nRESULTS ");
            System.out.println("Sum        : " + df.format(addition(firstNum,secondNum)));
            System.out.println("Difference : " + df.format(subtraction(firstNum,secondNum)));
            System.out.println("Product    : " + df.format(multiplication(firstNum,secondNum)));
            
            if(secondNum == 0) System.out.println("Quotient: Undefined (cannot divide by zero)");
            else System.out.println("Quotient   : " + df.format(division(firstNum,secondNum)));


      } catch(InputMismatchException e){
          System.out.println("Invalid input! Please enter numbers only...");
      }
      
      sc.close();
      
    } //addition
    static double addition(double x, double y){
      return x + y;        
    } //subtraction
    static double subtraction(double x, double y){
      return x - y;       
    } //multiplication
    static double multiplication(double x, double y){
      return x * y;       
    } //division
    static double division(double x, double y){
      return x / y; 
    }
}