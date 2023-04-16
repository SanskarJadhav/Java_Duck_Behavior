// creating an abstract class called Duck
public abstract class Duck {
    // declaring objects of interfaces
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;
    // abstract method display common to all
    abstract void display();
    // setter methods for each interface
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
    // calling method from each interface
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performSwim(){
        swimBehavior.swim();
    }
}
