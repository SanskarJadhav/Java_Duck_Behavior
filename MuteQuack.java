// MuteQuack class implements QuackBehavior interface
public class MuteQuack implements QuackBehavior{
    // override quack method
    @Override
    public void quack() {
        System.out.println(".... (awkward silence)");
    }
}
