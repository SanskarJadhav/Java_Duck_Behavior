public class Main {
    public static void main(String[] args) {
        // object for mallard duck class
        MallardDuck md = new MallardDuck();
        md.display();
        md.performQuack();
        md.performFly();
        md.performSwim();
        System.out.println();
        // object for redhead duck class
        RedheadDuck red =  new RedheadDuck();
        red.display();
        red.performQuack();
        red.performFly();
        red.performSwim();
        System.out.println();
        // object for rubber duck class
        RubberDuck rd = new RubberDuck();
        rd.display();
        rd.performQuack();
        rd.performFly();
        rd.performSwim();
        System.out.println();
        // object for decoy duck class
        DecoyDuck dd = new DecoyDuck();
        dd.display();
        dd.performQuack();
        dd.performFly();
        dd.performSwim();
    }
}
