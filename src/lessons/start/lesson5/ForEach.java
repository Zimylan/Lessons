package lessons.start.lesson5;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        for (int number : numbers) { //number is new variable, exist inside FOR only
            System.out.println(number);
        }

        //fori (counter)
        for (int i = 0; i < 3; i++) {
            int number = numbers[i];
            System.out.println(number);
            //Or
            System.out.println(numbers[i]);
        }

        //Print all even numbers from the array
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }


    }
}
