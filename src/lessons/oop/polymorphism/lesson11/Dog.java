package lessons.oop.polymorphism.lesson11;

public final class Dog extends Animals {
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    public void bark() {
        System.out.println("Bork! Bork!");
    }
}
