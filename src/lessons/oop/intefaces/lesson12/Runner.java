package lessons.oop.intefaces.lesson12;

public class Runner {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Cars car = new Cars();

        Movable[] movables = new Movable[2];
        movables[0] = dog;
        movables[1] = car;




        for (Movable movable : movables) {
            movable.move();
        }
    }
}
