public class SumFirstAndLastDigit {

    public static int sumFirstAndLastDigit(int number) {

        if (number >= 0) {
            String numberString = Integer.toString((number));
            int firstDigit = Character.getNumericValue(numberString.charAt(0));
            int endDigit = Character.getNumericValue(numberString.charAt(numberString.length() - 1));
            return firstDigit + endDigit;
        } else {
            return -1;
        }
    }

}
