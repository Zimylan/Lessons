package lessons.start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        // Boolean 1 bit
        boolean iAmProgrammer = false;
        boolean iAmChemist = true;

        //Byte - 8 bit
        byte maxByte = 127;
        byte minByte = -128;

        //Short - 2 bytes or 16 bit
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - 4 bytes or 32 bit
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        //Long - 8 bytes or 64 bit. Must end with "L"
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Double - float point number, 64 bit
        double fantaBottleValue = 1.5;

        //Float - float point number, 32 bit. Must end with "F"
        float colaBottleValue = 0.33F;

        double doubleEx = 1.12345678901234567890;
        float floatEx = 1.12345678901234567890F;

        System.out.println("double: " + doubleEx);
        System.out.println("float: " + floatEx);

        //Char - character(symbol), 16 bit
        char letter = 'П';
        System.out.println(letter);
        letter++;
        System.out.println(letter); //П --> Р

        //var - Java itself will understand what type it is
        var isInt = 15;
        System.out.println(isInt);
        var isChar = 'Ж';
        System.out.println(isChar);

    }
}
