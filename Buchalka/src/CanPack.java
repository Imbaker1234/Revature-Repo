public class CanPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)) {

            int howFull = goal;

            for (int i = 0; i < bigCount; i++) {
                if (howFull >= 5) {
                    howFull -= 5;
                }
            }

            for (int i = 0; i < smallCount; i++) {
                if (howFull > 0) {
                    howFull -= 1;
                }
            }

            if (howFull == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
