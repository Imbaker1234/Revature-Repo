class PrintYearsAndDays {
    public static void main(String[] args) {

        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes >= 0) {
            int days = (int) (minutes / 1440);
            int years = days / 365;
            int finalDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + finalDays + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}