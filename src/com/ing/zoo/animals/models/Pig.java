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
    private String helloText;
    private String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    // Constructor for Pig
    public Pig() {
        this.helloText = "Splash, oink oink";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void eatMeat() {
        eatText = "Ah, a dead frog! Nomnomnom, oink thnx!";
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves() {
        eatText = "Nice, some leafs! Munch munch, oink oink!";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        int rnd = RANDOM.nextInt(2);

        if (rnd == 0) {
            trick = "Rolling in the mud!";
        } else {
            trick = "Running in circles!";
        }

        System.out.println(trick);
    }
}
