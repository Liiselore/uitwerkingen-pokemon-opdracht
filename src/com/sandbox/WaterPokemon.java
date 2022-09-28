package com.sandbox;

public class WaterPokemon extends Pokemon{
    private boolean knowsWaterGun;
    private boolean knowsWaterPulse;
    private boolean knowsHydropump;

    public WaterPokemon(String name, int indexNumber, int level, boolean canEvolve, boolean knowsWaterGun, boolean knowsWaterPulse, boolean knowsHydropump) {
        super(name, indexNumber, level, canEvolve);
        this.knowsWaterGun = knowsWaterGun;
        this.knowsWaterPulse = knowsWaterPulse;
        this.knowsHydropump = knowsHydropump;
    }

    public boolean isKnowsWaterGun() {
        return knowsWaterGun;
    }

    public void setKnowsWaterGun(boolean knowsWaterGun) {
        this.knowsWaterGun = knowsWaterGun;
    }

    public boolean isKnowsWaterPulse() {
        return knowsWaterPulse;
    }

    public void setKnowsWaterPulse(boolean knowsWaterPulse) {
        this.knowsWaterPulse = knowsWaterPulse;
    }

    public boolean isKnowsHydropump() {
        return knowsHydropump;
    }

    public void setKnowsHydropump(boolean knowsHydropump) {
        this.knowsHydropump = knowsHydropump;
    }

    @Override
    public void printStats() {
        System.out.println("The name of your water Pokémon is " + getName());
        System.out.println("It is currently on level " + getLevel());
        System.out.println("The indexnumber of the Pokémon is " + getIndexNumber());
        System.out.println("It knows the following attacks: " +
                " Hydropump: " + knowsHydropump +
                ". Watergun: " + knowsWaterGun +
                ". Waterpulse: " + knowsWaterPulse);
    }

    @Override
    public void eat() {
        System.out.println("Your water pokemon ate a Occa Berry and takes only half damage from a Fire-type move!");
    }

    @Override
    public void levelUp() {
        if (getLevel() == 16) {
            System.out.println("Your grass pokemon evolved!");
        } else if (getLevel() >= 36) {
            System.out.println("Your grass pokemon evolved to the maximum and is now level " + getLevel() + "!");
        } else {
            System.out.println("Your grass pokemon is now on level " + getLevel());
        }
    }
}