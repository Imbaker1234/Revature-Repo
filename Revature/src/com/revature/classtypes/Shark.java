package com.revature.classtypes;

public class Shark extends Fish implements Hunt {
    private boolean isMoving;

    @Override
    public void swim() {
        isMoving = true;
        System.out.println("I swim in water and I'm terrifying");
    }

    @Override
    public void breathe() {
        if (isMoving) {
            System.out.println("I breathe underwater! Mehhhhhhhehehehehehegh");
        } else {
            System.out.println("Choking! CHOKING!");
        }
    }

    @Override
    public void findPrey() {
        System.out.println("I'ma comin' fer ya!");
    }
}
