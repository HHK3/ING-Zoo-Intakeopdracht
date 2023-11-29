package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.Herbivore;
import com.ing.zoo.animals.interfaces.TrickAnimal;

import java.util.Random;

/**
 * Instance class for Fox
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Fox implements Animal, Carnivore, Herbivore, TrickAnimal {
    private String name;
    private final String helloText;
    private String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    /**
     * Constructor for Fox
     *
     * @param name The name of the fox
     */
    public Fox(String name) {
        this.name = name;
        this.helloText = "Ring-ding-ding-ding-dingeringeding! Mission complete!";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        this.eatText = "Oh, some meat! Nomnomnom";
        System.out.println(eatText);
    }

    @Override
    public void eatLeafs() {
        this.eatText = "Oh, some leafs! Munch munch";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        int rnd = RANDOM.nextInt(2);

        if (rnd == 0) {
            trick = "Performing a backflip!";
        } else {
            trick = "Wavedash!";
        }

        System.out.println(trick);
    }
}
