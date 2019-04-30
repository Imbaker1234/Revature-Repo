public class Goblin extends Goblinoid {
    // ================SIMULATOR==================
    public static void main(String[] args) {

        Goblin griknash = new Goblin(22, 14, 20);
        Hobgoblin graxxor = new Hobgoblin(34, 16, 20);

        int counter = 0;
        System.out.println("=================");
        while ((griknash.getHitPoints() >= 0) && (graxxor.getHitPoints() >= 0)) {
            counter++;
            System.out.println("ROUND " + counter);
            if (graxxor.getHitPoints() > 0) {
                int damageRoll = graxxor.unarmedAttack();
                System.out.println("Graxxor attacks for " + damageRoll + " damage!");
                griknash.setHitPoints(griknash.getHitPoints() - damageRoll);
            }
            if (griknash.getHitPoints() > 0) {
                int damageRoll = graxxor.unarmedAttack();
                System.out.println("Griknash attacks for " + damageRoll + " damage!");
                graxxor.setHitPoints(griknash.getHitPoints() - damageRoll);
            }
            System.out.println();
            System.out.println(
                    "\nGriknash = " + griknash.getHitPoints() +
                    "\nGraxxor = " + graxxor.getHitPoints());
            System.out.println();
            System.out.println("=================");
        }

    }

    // ================FIELDS==================

    // ================CONSTRUCTORS==================

    public Goblin(int hitPoints, int armorClass, int moveSpeed) {
        super(hitPoints, armorClass, moveSpeed);
    }
}