public class SquareStar {

    public static void main(String[] args) {
        printSquareStar(6);
        System.out.println();
        printSquareStar(40);
        System.out.println();
        printSquareStar(70);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("INVALID VALUE");
        } else {
            String printStatement = "";
            for (int currentRow = 0; currentRow < number; currentRow++) { // ROWS
                for (int currentColumn = 0; currentColumn < number; currentColumn++) { // COLUMNS
                    //Begin For Loop Logic

                    //Checks for first or last row
                    if ((currentRow == 0) || (currentRow == (number - 1))) {
                        System.out.print("*");
                        //Checks for first of last column
                    } else if ((currentColumn == 0) || (currentColumn == (number - 1))) {
                        System.out.print("*");
                        //Speaks for itself
                    } else if (currentColumn == currentRow) {
                        System.out.print("*");
                    } else if (currentColumn == (number - (currentRow + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}