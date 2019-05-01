import java.util.LinkedList;
import java.util.List;

public class Creature {

    // ================SIMULATOR==================
    public static void main(String[] args) {
        Creature goblin = new Creature();

        System.out.println(goblin.unarmedAttack());

    }
    // ================FIELDS==================


    private int hitPoints;
    private int armorClass;

    private int strength;
    private int dexterity;
    private int constitution;
    private int wisdom;
    private int intelligence;
    private int charisma;

    private int strMod;
    private int dexMod;
    private int conMod;
    private int wisMod;
    private int intMod;
    private int chaMod;

    private int[] position;
    private int moveSpeed;

    private String size;

    private List<String> languages = new LinkedList<String>();

    // ================CONSTRUCTORS==================

    public Creature(int hitPoints, int armorClass, int moveSpeed) {
        this.hitPoints = 100 + (int) ((Math.random() * ((10 - 1) + 1)) + 3);
        this.armorClass = armorClass;
        this.strength = (int) ((Math.random() * ((18 - 3) + 1)) + 3);
        this.dexterity = (int) ((Math.random() * ((18 - 3) + 1)) + 3);
        this.constitution = (int) ((Math.random() * ((18 - 3) + 1)) + 3);
        this.wisdom = (int) ((Math.random() * ((18 - 3) + 1)) + 3);
        this.intelligence = (int) ((Math.random() * ((18 - 3) + 1)) + 3);
        this.charisma = (int) ((Math.random() * ((18 - 3) + 1)) + 3);
        this.position = position;
        this.moveSpeed = moveSpeed;
    }

    // ================BEHAVIORS==================

    public int unarmedAttack() {
        return (int) ((Math.random() * ((4 - 1) + 1)) + 1);
    }

    public int attackRoll() {
        int attackRoll = (int) ((Math.random() * ((20 - 1) + 1)) + 1);
        return attackRoll + this.strength;
    }


    public int calculateAbilityModifier(int attribute){
        if (attribute > 10) {
            return attribute / -2;
        } else if(attribute < 10) {
            return attribute / 2;
        } else {
            return 0;
        }
    }

    // ================GETTERS AND SETTERS==================



    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
        calculateAbilityModifier(strength);
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int[] getPosition() {
        return position;
    }

    // MOVE IS A STAND-IN FOR SET POSITION
    public void move(String direction, int numberOfSquares) {
        switch (direction.toLowerCase()) {
            case "north":
                getPosition()[1] += numberOfSquares;
                break;
            case "northwest":
                getPosition()[0] -= numberOfSquares / 2;
                getPosition()[1] += numberOfSquares /2;
                break;
            case "west":
                getPosition()[0] -= numberOfSquares;
                break;
            case "southwest":
                getPosition()[0] -= numberOfSquares / 2;
                getPosition()[1] -= numberOfSquares /2;
                break;
            case "south":
                getPosition()[1] -= numberOfSquares;
                break;
            case "southeast":
                getPosition()[0] += numberOfSquares / 2;
                getPosition()[1] -= numberOfSquares /2;
                break;
            case "east":
                getPosition()[0] += numberOfSquares;
                break;
            case "northeast":
                getPosition()[0] += numberOfSquares / 2;
                getPosition()[1] += numberOfSquares /2;
                break;
            default:
                System.out.println("Invalid Move");
                break;
        }
    }


    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}

