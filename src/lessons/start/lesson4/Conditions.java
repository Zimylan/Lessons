package lessons.start.lesson4;

public class Conditions {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        //"if" construction
        if (x > y) {
            System.out.println("x is equal or greater then y");
        }

        y = 7;
        if (x > y) {
            System.out.println("x is equal or greater then y");
        } else {
            System.out.println("x is less or equal to y");
        }

        y = 5;
        if (x > y) {
            System.out.println("x is greater then y");
        } else if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is less than y");
        }

        //boolean math
        boolean isTrue = true;
        boolean isTrueToo = true;

        boolean isFalse = false;
        boolean isFalseToo = false;

        //AND - &&
        boolean isTrueAndTrue = isTrue && isTrueToo; //True + true = true
        boolean isTrueAndFalse = isTrue && isFalse; //True + false = false
        boolean isFalseAndFalse = isFalse && isFalseToo; //False + false = false

        //OR - ||
        boolean isTruOrFalse = isTrue || isTrueToo; //True + true = true
        boolean isTrueOrFalse = isTrue || isFalse; //True + false = true
        boolean isFalseOrFalse = isFalse || isFalseToo; //False + false = false

        //NOT - !
        boolean isNotTrue = !isTrue; // Not true = false

        if (isNotTrue) {
            System.out.println("Is true");
        } else {
            System.out.println("Is false");
        }
    }
}
