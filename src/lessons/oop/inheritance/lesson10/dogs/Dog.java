package lessons.oop.inheritance.lesson10.dogs;

import lessons.oop.inheritance.lesson10.ALive;

public abstract class Dog extends ALive {
    protected String nameDog = "Bobik"; //If private class Puddle doesn't work, you need to use protected
    protected int countTeeth;
    protected final int countLegs = 4; //Can't change from outside

    public Dog(String name, int countTeeth) {
        this.nameDog = name;
        this.countTeeth = countTeeth;
    }

    public abstract void bark();

    public void beAngry() {
        System.out.println("The dog growls");
    }

    public final void eat() {
        System.out.println("The dog eats");
    };
}
