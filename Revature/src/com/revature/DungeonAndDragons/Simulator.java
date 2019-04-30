package com.revature.DungeonAndDragons;

public class Simulator {
    public static void main(String[] args) {
        Human jeffTheHuman = new Human();
        Dwarf thorinTheDwarf = new Dwarf();
        Goblin griknashTheGoblin = new Goblin();
        Hobgoblin grakkusTheHobgoblin = new Hobgoblin();

        System.out.println(jeffTheHuman.speak());
        System.out.println(thorinTheDwarf.speak());
        System.out.println(griknashTheGoblin.speak());
        System.out.println(grakkusTheHobgoblin.speak());
    }

}
