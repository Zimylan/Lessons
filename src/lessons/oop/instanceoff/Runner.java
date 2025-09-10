package lessons.oop.instanceoff;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Cat catTest = (Cat) cat; //Create new object catTest (its class Cat), and save object cat into catTest like the Cat class object

//        cat.catSay //Doesn't work, because the cat object create us the Animal class

        Animal[] zoo = {cat, dog};

        for (Animal animal : zoo) {
            if (animal instanceof Cat) { //If animal is Cat class, changes its class from Animal to Cat
                Cat instanceoffCat1 = (Cat) animal;
                instanceoffCat1.catSay();

            }
        }

        for (Animal animal : zoo) {
            if (animal instanceof Cat instanceoffCat2) { //Create the Cat class object instantly
                instanceoffCat2.catSay();

            }
        }

    }
}
