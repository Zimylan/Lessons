package lessons.start.lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //sum, diff, multiply
        int sum = x + y;
        int diff = x - y;
        int multiply = x * y;

        //divide is int, if y = 5
        int divideIntYIs5 = x / y;
        System.out.println(divideIntYIs5);

        //divide is int, if y = 3
        y = 3;
        int divideIntYIs3 = x / y;
        System.out.println(divideIntYIs3 + ", but must be 3,333...");

        //divide is double, but x and y is int
        double divideDoubleFirstTry = x / y;
        System.out.println(divideDoubleFirstTry + " It's wrong! Must be 3,333...");

        //double is double, but x convert to double
        double divideDoubleSecondTry = (double) x / y;
        System.out.println(divideDoubleSecondTry + " It's true!");

        //increment and decrement
        x = x + 1; //increment
        System.out.println(x);
        x = x - 1; //decrement
        System.out.println(x);
        //or
        x++; //increment
        System.out.println(x);
        x--; //decrement
        System.out.println(x);
        //or
        x += 1; //increment
        System.out.println(x);
        x -= 1; //decrement
        System.out.println(x);

        //similarly
        x = x * 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 2;
        System.out.println(x);

        //division by modulo (even or odd)
        int moduloEven = 4 % 2;
        System.out.println(moduloEven);
        int moduloOdd = 5 % 2;
        System.out.println(moduloOdd);

        //brackets
        int calculateIt = 2 + 2 * 2;
        System.out.println(calculateIt);

        int calculateItNow = (2 + 2) * 2;
        System.out.println(calculateItNow);

    }
}
