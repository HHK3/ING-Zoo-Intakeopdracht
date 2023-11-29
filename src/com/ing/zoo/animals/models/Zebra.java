package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Herbivore;
import com.ing.zoo.animals.interfaces.TrickAnimal;

import java.util.Random;

/**
 * Instance class for Zebra
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Zebra implements Animal, Herbivore, TrickAnimal {
    private String name;
    private final String helloText;
    private final String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    /**
     * Constructor for Zebra
     *
     * @param name The name of the zebra
     */
    public Zebra(String name) {
        this.name = name;
        this.helloText = this.name + ": Zebra Zebra!";
        this.eatText = this.name + ": Munch munch: Zank Yee Brah!";
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
    public void eatLeafs() {
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        int rnd = RANDOM.nextInt(2);

        if (rnd == 0) {
            trick = this.name + ": Singing Afro Circus!";
        } else {
            trick = this.name + ": Running at high speed!";
        }

        System.out.println(trick);
    }
}
