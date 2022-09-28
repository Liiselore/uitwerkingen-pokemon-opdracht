package com.sandbox;

public abstract class Pokemon {
    private String name;
    private String nickname;
    private int indexNumber;
    private int level;
    private boolean canEvolve;

    public Pokemon(String name, int indexNumber, int level, boolean canEvolve) {
        this.name = name;
        this.indexNumber = indexNumber;
        this.level = level;
        this.canEvolve = canEvolve;
    }

    public abstract void printStats();

    public abstract void eat();

    public abstract void levelUp();

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public int getLevel() {
        return level;
    }

    public boolean isCanEvolve() {
        return canEvolve;
    }
}