public class getEvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int numberToAdd;
        int returnVar = 0;

        if (number >= 0) {

            int iterationLimit = Integer.toString(number).length();

            for (int i = 0; i <= iterationLimit; i++) {
                if ((number % 10) % 2 == 0) {
                    numberToAdd = number % 10;
                } else {
                    numberToAdd = 0;
                }
                System.out.println("Iteration " + i);
                System.out.println("Number to Add " + numberToAdd);
                returnVar += numberToAdd;
                number /= 10;
            }
            return returnVar;
        } else {
            return -1;
        }
    }
}

