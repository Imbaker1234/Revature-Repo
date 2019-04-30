package com.revature.DungeonAndDragons;

public class Goblin extends Goblinoid {

    @Override
    public String speak() {
        return "Your GP or your HP!";
    }

    @Override
    public int unarmedAttack() {
        return (int)Math.random() * ( 4 - 1 );
    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "I punch I kick I bite!";
    }
}
