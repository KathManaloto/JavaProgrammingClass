//This program will compute the cumulative sum of the parameters of the integer variable argument.
package chapter4;

public class Task8{

    public static int numList(int... nums){
        int cumulativeSum = 0;
        for(int num:nums){
           int sumOfEachParameter = 0;
           for(int i = 1 ; i <= num; i++){
            sumOfEachParameter += i;
           }
            System.out.println("Cumulative Sum of " + num + " : " + sumOfEachParameter);
            cumulativeSum += sumOfEachParameter;
        }
        return cumulativeSum;
    }
    public static void main(String[] args) {

        System.out.println("\nThis program will compute the cumulative sum of the parameters of the integer variable argument.");
        System.out.println("Cumulative Sum of all Parameters: " + numList(4,5,10));
    }
}
