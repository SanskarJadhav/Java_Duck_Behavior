// RubberDuck requires methods from abstract class Duck
public class RubberDuck extends Duck{
    // constructor with instances for required classes
    RubberDuck(){
        // rubber duck cannot fly
        flyBehavior = new FlyNoWay();
        // rubber duck can squeak
        quackBehavior = new Squeak();
        // rubber duck can float
        swimBehavior = new Float();
    }
    // override abstract method display
    @Override
    void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
