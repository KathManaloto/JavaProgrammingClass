//Using concatenation to print "H3110 w0rld 2.0 true"
package chapter2;

class Task2{

    public static void main(String[] args){
         
         //declare
         byte zero    = 0;
         char letter  = 'w';
         short num1   = 3;
         int num2     = 11;
         float num3   = 2.0f;
         boolean bool = true;

         String output = "H" + num1 + num2 + zero + " " + letter + zero + "rld " + num3 + " " + bool;
         System.out.println(output);

         /*using string formatter
         String formatted = String.format("H%d%d%d %c%drld %.1f %b",num1,num2,zero,letter,zero,num3,bool);
         System.out.println(formatted);
         */
    }
}