public abstract class Goblinoid extends Creature implements Sentient {

    // ================FIELDS==================


    // ================CONSTRUCTORS==================


    public Goblinoid(int hitPoints, int armorClass, int moveSpeed) {
        super(hitPoints, armorClass, moveSpeed);
    }


    // ================OVERRIDE METHODS==================


    @Override
    public void speak(String words) {
        System.out.println(words);
    }

    // ================SETTERS AND GETTERS==================


}
