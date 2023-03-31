package AlternativeClassesWithDifferentInterfaces.Solution;

public class RedHeadDuckRefactoring extends Duck implements Flyable, Quackable {
    public void display() {
        System.out.println("I'm a red head duck");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public void quack() {
        System.out.println("Quack, quack ...");
    }
}
