package chapter6;

interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal{
    public boolean feed(boolean timeToEat){
        if(timeToEat){
            System.out.println("//put gorilla food into cage: Gorilla is eating...");
            return true;
        }
        else{
            System.out.println("Gorilla is not hungry...");
            return false;
        }
    }
    public void groom(){
        System.out.println("//lather, rinse, repeat: Gorilla is grooming...");
    } 
    public void pet(){
        System.out.println("//pet at your own risk: Petting the gorilla...");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}