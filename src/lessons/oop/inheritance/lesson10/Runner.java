package lessons.oop.inheritance.lesson10;

import lessons.oop.inheritance.lesson10.dogs.Poodel;

public class Runner {
    public static void main(String[] args) {
        Poodel poodel = new Poodel("Samson");

//        Dog dog = new Dog(); //Is not work, because abstract

//        poodel.nameDog //Doesn't work if nameDog private in an abstract class
        poodel.bark();
        poodel.breath();
//        System.out.println(poodel.countTeeth); //countTeeth is 'protected' and not available outside of class "Dog"
        poodel.beAngry();
    }
}
