package lessons.oop.inheritance.lesson10.dogs;

public final class Poodel extends Dog{ //Can't inherit from this class (final)

    public Poodel(String name) {
        super(name, 28); //Will be used an abstract class "Dog" constructor
    }

    @Override
    public void bark(){
        System.out.printf("%s say: Bark! Bark!\n", this.nameDog);
    }

    @Override
    public void breath() {
        System.out.println("Puddle breath");
    }

    @Override
    public void beAngry() {
        //Poodle saw a man
        //The dog growls
        //Poodle calmed down

        System.out.println("Poodle saw a man");
        super.beAngry(); //Will be called an abstract class "Dog" method
        System.out.println("Poodle calmed down");
    }

//    @Override
//    public void eat() { //if method in "Dog" class is 'final', can't override
//        System.out.println("Poodle eats");
//    }
}
