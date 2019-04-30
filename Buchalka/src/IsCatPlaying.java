class IsCatPlaying {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 45));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int playTemp = (summer) ? 45 : 35;

        if ((temperature >= 25) && (temperature <= playTemp)) {
            return true;
        }
        return false;
    }
}