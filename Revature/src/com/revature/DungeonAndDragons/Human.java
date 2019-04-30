package com.revature.DungeonAndDragons;

public class Human extends HeroRace {

    @Override
    public String speak() {
        return "Well howdy there fellow humans! Human fella's!";
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
        return "Ouch";
    }

}
