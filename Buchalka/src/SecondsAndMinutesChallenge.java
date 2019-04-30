public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "INVALID PARAMETERS";

    public static void main(String[] args) {
        convertTime(3232);
        convertTime(2121, 12);
        convertTime(-222);
    }


    public static void convertTime(int seconds) {
        if (seconds >= 0) {
            int returnSeconds = seconds % 60;
            String formattedSeconds = String.format("%02d", returnSeconds);
            int minutes = seconds / 60;
            int returnMinutes = minutes % 60;
            String formattedMinutes = String.format("%02d", returnMinutes);
            int returnHours = minutes / 60;
            String formattedHours = String.format("%02d", returnHours);

            System.out.println("Hours: " + formattedHours + " Minutes: " + formattedMinutes + " Seconds " + formattedSeconds);
        } else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }

    public static void convertTime(int seconds, int minutes) {

        if (seconds >= 0 && minutes >= 0) {
            int inputSeconds = seconds + (minutes * 60);
            convertTime(inputSeconds);
        } else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }

}
