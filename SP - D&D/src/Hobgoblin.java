public class Hobgoblin extends Goblinoid {

    // ================CONSTRUCTORS==================


    public Hobgoblin(int hitPoints, int armorClass, int moveSpeed) {
        super(hitPoints, armorClass, moveSpeed);
        this.setSTR(this.getSTR() + 2);
    }
}
