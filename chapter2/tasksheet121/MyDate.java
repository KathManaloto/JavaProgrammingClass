package chapter2.tasksheet121;

public class MyDate {
    public static void main(String[] args) {
        
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(9, 21, 1984);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        
       // display leapyears
       DateTask.leapYears();

    }
}