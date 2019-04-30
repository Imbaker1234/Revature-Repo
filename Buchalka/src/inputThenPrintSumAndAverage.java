import java.util.Scanner;

public class inputThenPrintSumAndAverage {

    public static void inputThenPrintSumAndAverage() {
        double numAverage = 0;
        double numSum = 0;
        double counter = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            if (in.hasNextDouble()) {
                double enteredNumber = in.nextDouble();
                numSum += enteredNumber;
                counter++;
                in.nextLine();
                numAverage = numSum / counter;
            } else {
                System.out.println("SUM = " + numSum + " AVG = " + numAverage);
                break;
            }

        }
    }
}

