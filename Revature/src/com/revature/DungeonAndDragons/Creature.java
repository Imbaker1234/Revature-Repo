package com.revature.DungeonAndDragons;

public abstract class Creature {
    boolean isAlive = true;
    int baseArmorClass = 10;
    int baseHP = 10;

    public int unarmedAttack() {
        return (int)Math.random() * ( 4 - 1 );
    }

    public int move() {
        return 30;
    }

    public String makeSound() {
        return "I punch I kick I bite!";
    }
}
