// FlyNoWay class implements FlyBehavior interface
public class FlyNoWay implements FlyBehavior{
    // override fly method
    @Override
    public void fly() {
        System.out.println("Wait, I can't fly!");
    }
}
