package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.Herbivore;
import com.ing.zoo.animals.interfaces.TrickAnimal;

import java.util.Random;

/**
 * Instance class for Pig
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Pig implements Animal, Carnivore, Herbivore, TrickAnimal {
    private String name;
    private final String helloText;
    private String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    /**
     * Constructor for Pig
     *
     * @param name The name of the pig
     */
    public Pig(String name) {
        this.name = name;
        this.helloText = this.name + ": Splash, oink oink";
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
        eatText = this.name + " Ah, a dead frog! Nomnomnom, oink thnx!";
        System.out.println(eatText);
    }

    @Override
    public void eatLeafs() {
        eatText = this.name + ": Nice, some leafs! Munch munch, oink oink!";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        int rnd = RANDOM.nextInt(2);

        if (rnd == 0) {
            trick = this.name + ": Rolling in the mud!";
        } else {
            trick = this.name + ": Running in circles!";
        }

        System.out.println(trick);
    }
}
