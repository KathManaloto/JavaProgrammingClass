//This program will check if a certain number is odd or even

package chapter1;

class Tasksheet113{

    public static void main(String[] args){

        //declare variable
        int check_number = 10;
        String message;

        for(int i = 1; i <= check_number; i++)
            System.out.println(message = (i%2 == 0 ) ? i + " is even number" : i + " is odd number");
    }
}