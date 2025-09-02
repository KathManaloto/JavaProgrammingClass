//Shape area and perimeter calculator using interface and abstract classes
package chapter5;

import java.text.DecimalFormat;

interface Shape{
    public double calculateArea();
    public double calculatePerimeter();
}
abstract class AbstractShape implements Shape{
    String color;
    double length; 
    double width;
 
    public AbstractShape(String color, double length, double width){
        this.color  = color;
        this.length = length;
        this.width  = width;
    }
}
class Circle extends AbstractShape{

    public double radius;
    public Circle(String color,double radius){
        super(color, 0,0);
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends AbstractShape{

    public Rectangle(String color,double length, double width){
        super(color,length,width);
    }
    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return 2 * (length + width);
    }
}
public class Task15 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");
        Circle whiteCircle = new Circle("white",5);
        Rectangle greenRectangle = new Rectangle("green",10,6);

        System.out.println("\nRESULTS");
        System.out.println("Area of the circle     : " + df.format(whiteCircle.calculateArea()));
        System.out.println("Perimeter of the circle: " + df.format(whiteCircle.calculatePerimeter()));
        System.out.println("Area of the rectangle  : " + df.format(greenRectangle.calculateArea()));
        System.out.println("Perimeter of rectangle : " + df.format(greenRectangle.calculatePerimeter()));
    } 
}