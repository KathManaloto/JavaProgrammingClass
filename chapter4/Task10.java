///Write the method printFullName of student which prints the full name of student 
package chapter4;

class Student{
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    //code
    public void printFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student("Morgan","Freeman"),
            new Student("Brad","Pitt"),
            new Student("Kevin","Spacey"),
        };
        for (Student s : students){
            s.printFullName();
        }

    }
}
