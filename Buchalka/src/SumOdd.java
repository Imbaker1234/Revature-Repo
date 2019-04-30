public class SumOdd {

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOfAll = 0;
        if (((start > 0) && (end > 0)) && (start <= end)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfAll += i;
                }
            }
            return sumOfAll;
        } else {
            return -1;
        }
    }
}
