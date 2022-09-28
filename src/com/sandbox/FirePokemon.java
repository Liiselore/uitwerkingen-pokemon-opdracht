package com.sandbox;

public class FirePokemon extends Pokemon{
    private boolean knowsEmber;
    private boolean knowsFireFang;
    private boolean knowsFlamethrower;

    public FirePokemon(String name, int indexNumber, int level, boolean canEvolve, boolean knowsEmber, boolean knowsFireFang, boolean knowsFlamethrower) {
        super(name, indexNumber, level, canEvolve);
        this.knowsEmber = knowsEmber;
        this.knowsFireFang = knowsFireFang;
        this.knowsFlamethrower = knowsFlamethrower;
    }

    public boolean isKnowsEmber() {
        return knowsEmber;
    }

    public void setKnowsEmber(boolean knowsEmber) {
        this.knowsEmber = knowsEmber;
    }

    public boolean isKnowsFireFang() {
        return knowsFireFang;
    }

    public void setKnowsFireFang(boolean knowsFireFang) {
        this.knowsFireFang = knowsFireFang;
    }

    public boolean isKnowsFlamethrower() {
        return knowsFlamethrower;
    }

    public void setKnowsFlamethrower(boolean knowsFlamethrower) {
        this.knowsFlamethrower = knowsFlamethrower;
    }

    @Override
    public void printStats() {
        System.out.println("The name of your fire Pokémon is " + getName());
        System.out.println("It is currently on level " + getLevel());
        System.out.println("The indexnumber of the Pokémon is " + getIndexNumber());
        System.out.println("It knows the following attacks: " +
                " Ember: " + knowsEmber +
                ". Fire fang: " + knowsFireFang +
                ". Flamethrower: " + knowsFlamethrower);
    }

    @Override
    public void eat() {
        System.out.println("Your fire pokemon ate a Rindo Berry and takes only half damage from a Grass-type move!");
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