// RedheadDuck requires methods from abstract class Duck
public class RedheadDuck extends Duck{
    // constructor with instances for required classes
    RedheadDuck(){
        // redhead duck can fly
        flyBehavior = new FlyWithWings();
        // redhead duck can quack
        quackBehavior = new Quack();
        // redhead duck can swim
        swimBehavior = new Swim();
    }
    // override abstract method display
    @Override
    void display() {
        System.out.println("I am a Redhead Duck.");
    }
}
