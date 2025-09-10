package lessons.oop.polymorphism.lesson11;

public class Runner {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

//        Animals dog = new Dog(); //Also work, but use Animals methods only
//        Animals cat = new Cat(); //Also work, but use Animals methods only

        dog.bark(); //Work if a dog is a class Dog, but doesn't work if is a class Animals

        Animals[] animals = new Animals[2];
        animals[0] = dog;
        animals[1] = cat;


        for (Animals animal : animals) {
            animal.eat();
        }


    }
}
