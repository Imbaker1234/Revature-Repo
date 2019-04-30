import com.revature.pillars.UltraRocketShip;

public class Simulator {
    public static void main(String[] args) {
        UltraRocketShip USS = new UltraRocketShip("USS Delicious", 2, 100, false, true, "Acai Berry Drive");

        System.out.println(USS.toString());
        System.out.println();
        USS.blastOff();

    }
}
