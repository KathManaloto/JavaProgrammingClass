//Create a subclass of the abstract class and implement the abstract method. 
package chapter5;

abstract class abstractClass{
    abstract void abstractMethod();
    void concreteMethod(){              //concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}
class B extends abstractClass{
    void abstractMethod(){
        System.out.println("B's implementation of abstractMethod."
        );
    }
}
class C extends abstractClass{
    //insert code here
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}
public class Task14{
    public static void main(String[] args){
        B b = new B();
        b.abstractMethod();             //output: B's implementation of abstractMethod.
        b.concreteMethod();             //output: This is a concrete method.
        C c = new C();
        c.abstractMethod();             //output: C's implementation of abstractMethod.
        c.concreteMethod();             //output: This is a concrete method.
    }
}