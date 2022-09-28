package com.sandbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 10, true, true, true, false);
        Pokemon ivysar = new GrassPokemon("Ivysar", 2, 16, true, true, true, true);
        Pokemon venusar = new GrassPokemon("Venusar", 3, 36, false, true, true, true);
        Pokemon charmander = new FirePokemon("Charmander", 4, 10, true, true, false, false);
        Pokemon charmeleon = new FirePokemon("Charmeleon", 5, 16, true, true, true, false);
        Pokemon charizard = new FirePokemon("Charizard", 6, 36, false, true, true, true);
        Pokemon squirtle = new WaterPokemon("Squirtle", 7, 10, true, true, false, false);
        Pokemon wartortle = new WaterPokemon("Wartortle", 8, 16, true, true, true, false);
        Pokemon blastoise = new WaterPokemon("Blastoise", 9, 36, false, true, true, true);
        Pokemon pikachu = new ElectricPokemon("Pikachu", 25, 16, false, true, true, false);

        List<Pokemon> allPokemon = new ArrayList<>();
        allPokemon.add(bulbasaur);
        allPokemon.add(ivysar);
        allPokemon.add(venusar);
        allPokemon.add(charmeleon);
        allPokemon.add(charmander);
        allPokemon.add(charizard);
        allPokemon.add(squirtle);
        allPokemon.add(wartortle);
        allPokemon.add(blastoise);
        allPokemon.add(pikachu);

        System.out.println("Hello there!");
        System.out.println("Welcome to the world of POKéMON!");
        System.out.println("My name is Oak!");
        System.out.println("People call me the POKéMON PROF!");
        System.out.println("This world is inhabited by creatures called POKéMON!");
        System.out.println("For some people, POKéMON are pets. Others use them for fights.");
        System.out.println("Myself...");
        System.out.println("I study POKéMON as a profession.");
        System.out.println("First, what is your name?");

        Scanner input = new Scanner(System.in);
        String yourName = input.nextLine();

        System.out.println("Right! So your name is " + yourName + "!");
        System.out.println("This is my grandson. He's been your rival since you were a baby.");
        System.out.println("...Erm, what is his name again?");

        String rivalName = input.nextLine();

        System.out.println("That's right! I remember now! His name is " + rivalName + "!");
        System.out.println(yourName + "!");
        System.out.println("Your very own POKéMON legend is about to unfold!");
        System.out.println("A world of dreams and adventures with POKéMON awaits! Let's go!");
        System.out.println(".......");
        System.out.println("Here " + yourName + "!");
        System.out.println("There are 3 POKéMON here!");
        System.out.println("HAHA!");
        System.out.println("They are inside the POKé BALLs!");
        System.out.println("When I was young, I was a serious POKéMON trainer!");
        System.out.println("In my old age, I have only 3 left, but you can have one! Choose!");
        System.out.println("And " + rivalName + ", you can have one too!");
        System.out.println("You can choose between these POKéMON:");
        System.out.println("For " + squirtle.getName().toUpperCase() + " press 's' + enter, " +
                "for " + bulbasaur.getName().toUpperCase() + " press 'b' + enter, " +
                "for " + charmander.getName().toUpperCase() + " press 'c' + enter");

        String chosenPokemon = input.nextLine();

        if (chosenPokemon.equalsIgnoreCase("s")) {
            System.out.println(yourName + " received " + squirtle.getName().toUpperCase() + "!");
            System.out.println("Your POKéDEX has been updated.");
            squirtle.printStats();
        } else if (chosenPokemon.equalsIgnoreCase("b")) {
            System.out.println(yourName + " reveived " + bulbasaur.getName().toUpperCase() + "!");
            System.out.println("Your POKéDEX has been updated.");
            bulbasaur.printStats();
        } else if (chosenPokemon.equalsIgnoreCase("c")) {
            System.out.println(yourName + " received " + charmander.getName().toUpperCase() + "!");
            System.out.println("Your POKéDEX has been updated.");
            charmander.printStats();
        } else {
            System.out.println("This was not an option..");
        }

        System.out.println(".....");
        System.out.println("I have an other surprise for you " + yourName + "!");
        System.out.println(yourName + ", this is the POKéMON I caught earlier.");
        System.out.println("You can have it. I caught it in the wild and it's not tame yet.");
        System.out.println(yourName + " received a " + pikachu.getName().toUpperCase() + "!");
        System.out.println("Do you want to give a nickname to " + pikachu.getName().toUpperCase() + "? y/n");

        String wantsToNicknamePokemon = input.nextLine();

        if (wantsToNicknamePokemon.equalsIgnoreCase("y")) {
            System.out.println("Nickname:");
            String nicknamePikachu = input.nextLine();
            pikachu.setNickname(nicknamePikachu);
            System.out.println(pikachu.getName().toUpperCase() + " has given the nickname " + pikachu.getNickname() + "!");
        } else if (wantsToNicknamePokemon.equalsIgnoreCase("n")) {
            System.out.println(pikachu.getName().toUpperCase() + " has no nickname!");
        } else {
            System.out.println("That was not an option..");
        }

        System.out.println("Your POKéDEX has been updated.");
        pikachu.printStats();
        System.out.println("If a wild POKéMON appears, your POKéMON can fight against it!");
        System.out.println("Afterward, go on to the next town.");
        System.out.println("Good luck!");
    }
}