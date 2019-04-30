package com.revature.DungeonAndDragons;

public class HeroRace extends Creature implements Sentient {
    int classLevel;
    int baseSTR;
    int baseDex;
    int baseCON;
    int baseINT;
    int baseWIS;
    int baseCHA;

    @Override
    public String speak() {
        return "Hail there!";
    }
}
