import java.util.Scanner;

public class MinMaxChallenge {

    // - Read numbers printed from the console entered by the user and print the minimum and maximum number the users
    // has entered.

    // - Before user enters the number print "Enter Number:"

    // - If the user enters an invalid number, break out of the loop, and print the minimum and maximum number.


    public static void main(String[] args) {
        int minNumber = 0;
        int maxNumber = 0;


        Scanner in = new Scanner(System.in);

        boolean endRun = false;

        while (true) {

            if (!endRun) {
                System.out.println("Enter Number: " + minNumber + "/" + maxNumber);
            }

            if (minNumber == 0 && maxNumber == 0) {
                int enteredNumber = in.nextInt();
                minNumber = enteredNumber;
                maxNumber = enteredNumber;
            } else {
                boolean inputValidate = in.hasNextInt();

                if (inputValidate) {
                    int enteredNumber = in.nextInt();
                    if (enteredNumber > maxNumber) {
                        maxNumber = enteredNumber;
                    } else if (enteredNumber < minNumber) {
                        minNumber = enteredNumber;
                    }
                } else {
                    in.nextLine();
                    if (!endRun) {
                        System.out.println("Min = " + minNumber +
                                "\nMax = " + maxNumber);
                    }
                    if (endRun = true) {
                        break;
                    }
                    endRun = true;
                }
            }
        }
    }

}
