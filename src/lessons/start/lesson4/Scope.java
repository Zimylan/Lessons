package lessons.start.lesson4;

public class Scope {
    public static void main(String[] args) {
        var isVariable = 10;

        if (isVariable > 9) {
            var isNewVariable = isVariable;
            isNewVariable /= 2;
            System.out.println("Old var = " + isVariable + "\n" + "Nev var = " + isNewVariable);
        }
        System.out.println("isVar = " + isVariable);
        //System.out.println(isNewVariable); //Variable is not visible outside
    }
}
