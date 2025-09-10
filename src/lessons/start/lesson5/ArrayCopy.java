package lessons.start.lesson5;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int x = 5;
        int y = x;

        System.out.println(x); //x and y are the same
        System.out.println(y);

        //Change x value
        x = 10;

        System.out.println(x); //x and y are not the same - y is copy of the original x
        System.out.println(y);

        int[] arrayOriginal = new int[]{1, 2, 3};
        int[] arrayCopy = arrayOriginal;

        System.out.println(Arrays.toString(arrayOriginal)); //They are the same
        System.out.println(Arrays.toString(arrayCopy));

        arrayOriginal[0] = 100; //Change first an array element in arrayOriginal only!

        //Array don't have to be the same
        System.out.println(Arrays.toString(arrayOriginal)); //But they are the same...
        System.out.println(Arrays.toString(arrayCopy));

    }
}
