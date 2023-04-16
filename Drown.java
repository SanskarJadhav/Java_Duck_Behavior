// Drown class implements SwimBehavior interface
public class Drown implements SwimBehavior{
    // override swim method
    @Override
    public void swim() {
        System.out.println("I will definitely drown.");
    }
}
