package AlternativeClassesWithDifferentInterfaces.Solution;

public class MallareDuckRefactoring extends Duck implements Flyable, Quackable {
    public void display() {
        System.out.println("I'm a mallard duck");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public void quack() {
        System.out.println("Quack, quack ...");
    }
}
