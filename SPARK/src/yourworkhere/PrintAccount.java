package yourworkhere;

public class PrintAccount {

    //I created this since multiple accounts might call it earlier in the course but I'm thinking a method might
    //be better as soon as I can figure out how to pass in the values of a specific object to it.

    public static void execute(double balance, double withdrawalAmount, double depositAmount) {
        System.out.println();
        System.out.println("Balance at Open of Business: $" + balance);
        System.out.println();
        System.out.println("Time  ----  Balance ---- Difference");
        System.out.println("-----------------------------------");
        System.out.println("12:43 PM + $" + (balance - withdrawalAmount) + " -- (-$" + withdrawalAmount + ")");
        balance = (balance - withdrawalAmount);
        System.out.println("07:32 PM - $" + (balance + depositAmount) + " -- (+$" + depositAmount + ")");
        balance = (balance + depositAmount);
        System.out.println();

    }
}
