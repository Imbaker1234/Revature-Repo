package com.revature.DungeonAndDragons;

public class Hobgoblin extends Goblinoid {

    @Override
    public String speak() {
        return "I kick! I stab! I bite!";
    }

    @Override
    public int unarmedAttack() {
       return (int)Math.random() * ( 6 - 1 );
    }

    @Override
    public int move() {
        return 30;
    }

    @Override
    public String makeSound() {
        return "Blargh!";
    }

}
