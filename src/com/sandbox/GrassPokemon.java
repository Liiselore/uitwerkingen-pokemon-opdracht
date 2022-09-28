package com.sandbox;

public class GrassPokemon extends Pokemon {
    private boolean knowsVineWhip;
    private boolean knowsLeechSeed;
    private boolean knowsRazorLeaf;

    public GrassPokemon(String name, int indexNumber, int level, boolean canEvolve, boolean knowsVineWhip, boolean knowsLeechSeed, boolean knowsRazorLeaf) {
        super(name, indexNumber, level, canEvolve);
        this.knowsVineWhip = knowsVineWhip;
        this.knowsLeechSeed = knowsLeechSeed;
        this.knowsRazorLeaf = knowsRazorLeaf;
    }

    public boolean isKnowsVineWhip() {
        return knowsVineWhip;
    }

    public void setKnowsVineWhip(boolean knowsVineWhip) {
        this.knowsVineWhip = knowsVineWhip;
    }

    public boolean isKnowsLeechSeed() {
        return knowsLeechSeed;
    }

    public void setKnowsLeechSeed(boolean knowsLeechSeed) {
        this.knowsLeechSeed = knowsLeechSeed;
    }

    public boolean isKnowsRazorLeaf() {
        return knowsRazorLeaf;
    }

    public void setKnowsRazorLeaf(boolean knowsRazorLeaf) {
        this.knowsRazorLeaf = knowsRazorLeaf;
    }


    @Override
    public void printStats() {
        System.out.println("The name of your grass Pokémon is " + getName());
        System.out.println("It is currently on level " + getLevel());
        System.out.println("The indexnumber of the Pokémon is " + getIndexNumber());
        System.out.println("It knows the following attacks: " +
                " Vine whip: " + knowsVineWhip +
                ". Leech seed: " + knowsLeechSeed +
                ". Razor leaf: " + knowsRazorLeaf);
    }

    @Override
    public void eat() {
        System.out.println("Your grass pokemon ate a Wacan Berry and takes only half damage from a Electric-type move!");
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