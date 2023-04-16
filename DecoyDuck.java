// DecoyDuck requires methods from abstract class Duck
public class DecoyDuck extends Duck{
    // constructor with instances for required classes
    DecoyDuck(){
        // wooden duck cannot fly
        flyBehavior = new FlyNoWay();
        // wooden duck cannot quack
        quackBehavior = new MuteQuack();
        // wooden duck will drown
        swimBehavior = new Drown();
    }
    // override the abstract method display defined in Duck
    @Override
    void display() {
        System.out.println("I am a Decoy Duck.");
    }
}