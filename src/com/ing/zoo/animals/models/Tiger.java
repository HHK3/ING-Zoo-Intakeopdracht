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
    private final String helloText;
    private final String eatText;
    private String trick;

    // Creating a constant for Random
    private static final Random RANDOM = new Random();

    /**
     * Constructor for Tiger
     *
     * @param name The name of the tiger
     */
    public Tiger(String name) {
        this.name = name;
        this.helloText = this.name + ": Rrraaarww";
        this.eatText = this.name + ": Mmmmm, delicious meat! Rrraaarww";
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
            trick = this.name + ": Jumping in a tree!";
        } else {
            trick = this.name + ": Scratching my ears!";
        }

        System.out.println(trick);
    }

}
