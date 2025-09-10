package lessons.start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] isArray = new int[2]; //Create an array with two elements (default values: 0) [0,0]
        System.out.println(isArray + " //This prints the array's hashcode/reference, not its contents");
        //Let's add class Arrays and method Arrays.toString to convert an array link to an array value
        System.out.println(Arrays.toString(isArray) + " //This shows the actual array contents");

        //Assigning values to the array
        int isIntPosition0 = 1;
        isArray[0] = isIntPosition0; //Assign variable to an array like first element
        isArray[1] = 2; //Assign literal value (integer) to an array like second element


        int[] newArray = new int[] {isIntPosition0, 2};
        System.out.println(Arrays.toString(newArray));

        int[] simpleWayToInitializeArray = {isIntPosition0, 2};
        System.out.println(Arrays.toString(simpleWayToInitializeArray));

        //Extract value from an array
        System.out.println(isArray[1] + " = 2");

        //Char array... is a string!
        char[] charArray = new char[5]; //Or {'H', 'e', 'l', 'l', 'o'}
        charArray[0] = 'H'; //Don't use "", '' only! "" - is String
        charArray[1] = 'e';
        charArray[2] = 'l';
        charArray[3] = 'l';
        charArray[4] = 'o';

        System.out.println(Arrays.toString(charArray));

    }
}
