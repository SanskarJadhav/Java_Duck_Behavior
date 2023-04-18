# Java_Duck_Behavior

This program utilises abstract classes and interfaces to display to the user certain features for four types of ducks: Mallard ducks, Redhead ducks, Rubber ducks, and Decoy (wooden) ducks.

The Main file displays these features for each duck, with an object for each duck class.

Duck is an abstract class used to define common methods for all ducks. It has objects for all three interfaces: flyBehavior, quackBehavior, and swimBehavior. It has an abstract method display(), three setter methods for the three interfaces and three methods to call upon one function from each interface: performFly(), performQuack(), and performSwim().

FlyBehavior is an interface with the abstract method fly(). Two classes implement FlyBehavior: FlyWithWings and FlyNoWay, overriding the fly() method to display that the duck can or cannot fly respectively.

QuackBehavior is an interface with the abstract method quack(). Three classes implement QuackBehavior: Quack, Squeak, and MuteQuack, overriding the quack() method to display that the duck can quack, squeak, or not speak respectively.

SwimBehavior is an interface with the abstract method swim(). Three classes implement SwimBehavior: Swim, Float, and Drown, overriding the swim() method to display that the duck can swim, float or drown respectively.
 
For each type of duck, a class is created that extends the abstract class Duck. Inside a constructor, instances are made for the correct classes in accordance with the actual features of the duck. The abstract method display is overwritten to display the type of duck to the user.
