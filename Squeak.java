// Squeak class implements QuackBehavior interface
public class Squeak implements QuackBehavior{
    // override quack method
    @Override
    public void quack() {
        System.out.println("Squeaky squeaky squeak.");
    }
}