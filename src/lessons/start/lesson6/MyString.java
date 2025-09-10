package lessons.start.lesson6;

public class MyString {
    public static void main(String[] args) {
        String text = "Hello world!";
        System.out.println(text);

        String string1 = "Hello"; //link to one object "Hello"
        String string2 = "Hello";
        System.out.println(string1 == string2); // true? string1 and string2 - it is one object

        String string3 = new String("Hello"); //create new class String elements
        String string4 = new String("Hello");
        System.out.println(string3 == string4);  //false, because it is two different objects


        //String methods
        String testString = "hElLo";
        System.out.println(testString);
        //Upper case
        String testStringUpper = testString.toUpperCase();
        System.out.println(testStringUpper);

        //Lower case
        String testStringLower = testString.toLowerCase();
        System.out.println(testStringLower);

        //string length
        int testStringLength = testString.length();
        System.out.println(testStringLength);

        //...мне впадлу писать остальные

        //String.format
        String name = "Maxim";
        int age = 16;
        String phrase = String.format("My name is %s, I am %d.", name, age);
        System.out.println(phrase);
        //Or
        System.out.printf("My name is %s. I am %d.\n", name, age);

        //Text blocks
        double salary = 16_000_000.00;
        String result = """
                Hello, my name is %s.
                I am %d.
                I am %s.
                My salary is %f.
                """.formatted(name, age, (age >= 18) ? "legal age" : "minor", salary);
        System.out.println(result);


    }
}
