package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.TrickAnimal;

import java.util.Random;

/**
 * Instance class for Falcon
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Falcon implements Animal, Carnivore, TrickAnimal {
    private String name;
    private final String helloText;
    private final String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    /**
     * Constructor for Falcon
     *
     * @param name The name of the falcon
     */
    public Falcon(String name) {
        this.name       = name;
        this.helloText  = this.name + ": Kraaaw! Personally, I prefer the air!";
        this.eatText    = this.name + ": Kraaaw! I'm eating a mouse!";
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
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        int rnd = RANDOM.nextInt(2);

        if (rnd == 0) {
            trick = this.name + ": Doing loopings!";
        } else {
            trick = this.name + ": Doing a barrel roll!";
        }

        System.out.println(trick);
    }
}
