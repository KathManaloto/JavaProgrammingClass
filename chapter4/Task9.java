//Math Operations with static import
package chapter4;

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b){
        return addExact(a,b);
    }
    public static int subtraction(int a, int b){
        return subtractExact(a,b);
    }
    public static int multiply(int a, int b){
        return multiplyExact(a,b);
    }
    public static float divide(int a, int b){
        return floorDiv(a,b);            //floor division
        //return (float)a/b;             //with decimal
    }
    public static void main(String[] args) {

        int firstNum  = 5;
        int secondNum = 10;

        System.out.println("\nThis program will perfom the 4 basic Math Operations using static import...");
        System.out.println("\nRESULTS");

        System.out.println(firstNum + " + " + secondNum + " = " + add(firstNum,secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + subtraction(firstNum,secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + multiply(firstNum,secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + divide(firstNum,secondNum));
    }
}