package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Carnivore;
import com.ing.zoo.animals.interfaces.TrickAnimal;

import java.util.Random;

/**
 * Instance class for Tiger
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Tiger implements Animal, Carnivore, TrickAnimal {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    // Constructor for Tiger
    public Tiger() {
        this.helloText = "Rrraaarww";
        this.eatText = "Mmmmm, delicious meat! Rrraaarww";
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
            trick = "Jumping in a tree!";
        } else {
            trick = "Scratching my ears!";
        }

        System.out.println(trick);
    }

}
