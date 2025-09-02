package chapter5;

public class Task13 {
    public static void main(String[] args) {
        Car[] cars =  {
            new Car("Toyota","Camry",2022,4),
            new Car("Chevrolet","Camaro",2022,2),
            new Car("Suzuki","Jimny",2019,3)
        };
        System.out.println("\nCar Details: ");
        for(Car car:cars)
            car.displayDetails();
    }
}
class Vehicle{
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
class Car extends Vehicle{
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetails(){
        System.out.println("\nMake: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}