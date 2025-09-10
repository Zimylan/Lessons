package lessons.start.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count1 = 1;
        while (count1 < 101) { //Print numbers 1 to 100
            System.out.println(count1);
            count1++;
        }

        while (true) {
            count1++;
            System.out.println(count1);
            if (count1 == 121) {
                break; //Also work in FOR cycles
            }
        }

        //DoWhile
        int count2 = 1;
        do {
            System.out.println(count2);
            count2++;
        } while (count2 < 101);

        //while and doWhile difference
        int i = 0;
        while (i < 0) { //while won't work
            System.out.println("(While) The operation was completed successfully, i == " + i);
            i++;
        }

        i = 0;
        do { //doWhile will work, but only once
            System.out.println("(doWhile) The operation was completed successfully, i == " + i);
            i++;
        } while (i < 0);
    }
}
