public class PalindromeNumbers {

    public static boolean isPalindrome(int number) {
        int initialNumber = number;
        StringBuilder sb1 = new StringBuilder();
        while (number != 0) {
            sb1.append(number % 10);
            number /= 10;
        }

        if((Integer.parseInt(sb1.toString()) == initialNumber)) {
            return true;
        }
        return false;
    }

}
