// MallardDuck requires methods from abstract class Duck
public class MallardDuck extends Duck{
    // constructor with instances for required classes
    MallardDuck(){
        // mallard duck can fly
        flyBehavior = new FlyWithWings();
        // mallard duck can quack
        quackBehavior = new Quack();
        // mallard duck can swim
        swimBehavior = new Swim();
    }
    // override abstract method display
    @Override
    void display() {
        System.out.println("I am a Mallard Duck.");
    }
}
