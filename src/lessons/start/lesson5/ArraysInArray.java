package lessons.start.lesson5;

public class ArraysInArray {
    public static void main(String[] args) {
        //Array of arrays - 2D
        int[] rowOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rowTwo = {14, 11, 12, 13, 14};
        int[] rowTree = {15, 16, 17, 18, 14, 20, 21, 22};

        int[][] matrix = {rowOne, rowTwo, rowTree};

        int rowCounter = 0;
        int columnCouner = 0;
        boolean numberIsFound = false;
        int numberToFind = 12;
        System.out.println("Find "+ numberToFind + " inside matrix");

        upperFor:
        for (int[] row : matrix) { //row is array of integers ---> type = int[]
            columnCouner = 0;
            rowCounter++;
            for (int cell : row) {
                columnCouner++;
                if (cell == numberToFind) {
                    System.out.println(cell + " found successfully!");
                    System.out.println(numberToFind + " in row " + rowCounter + " in " + columnCouner + " column");
                    numberIsFound = true;
                    break upperFor; //for finding the first number
                }
            }
        }
    }
}
