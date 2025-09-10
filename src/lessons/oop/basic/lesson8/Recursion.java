package lessons.oop.basic.lesson8;

public class Recursion {

    public int sum(int number) {
        if (number < 1){
            return 0;
        }
        int result = number + sum(number - 1);
        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        Recursion ansver = new Recursion();
        System.out.println(ansver.sum(number));
    }
}
