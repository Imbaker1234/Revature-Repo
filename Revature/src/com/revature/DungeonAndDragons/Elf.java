package com.revature.DungeonAndDragons;

public class Elf extends HeroRace {
    @Override
    public String speak() {
        return null;
    }

    @Override
    public int unarmedAttack() {
        return (int)Math.random() * ( 5 - 1 );    }

    @Override
    public int move() {
        return 30;
    }

    @Override
    public String makeSound() {
        return "I can sing a song! Oh yes I can sing a song! It won't last very long! But I can sing a song!";
    }
}
