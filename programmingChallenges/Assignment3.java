//Number to day of the week
//This program accepts 1-7 input and print the day in a week that corresponds to that number. 
package programmingChallenges;

import java.util.Scanner;

public class Assignment3 {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("This program accepts 1-7 input and print the day in a week that corresponds to that number.");

                System.out.print("\nEnter an integer between 1 - 7: ");

                if (sc.hasNextInt()) {

                        int num = sc.nextInt();

                        switch (num) {
                                case 1: System.out.println("Day of the week: Monday\n");
                                        break;
                                case 2: System.out.println("Day of the week: Tuesday\n");
                                        break;
                                case 3: System.out.println("Day of the week: Wednesday\n");
                                        break;
                                case 4: System.out.println("Day of the week: Thursday\n");
                                        break;
                                case 5: System.out.println("Day of the week: Friday\n");
                                        break;        
                                case 6: System.out.println("Day of the week: Saturday\n");
                                        break;        
                                case 7: System.out.println("Day of the week: Sunday\n");
                                        break;        
                                default:System.out.println("Invalid input! Please enter an integer between 1-7.\n");
                                        break;      
                        }
                } else  System.out.println("Invalid input! Please enter an integer between 1-7.\n");
                sc.close();
        }
}