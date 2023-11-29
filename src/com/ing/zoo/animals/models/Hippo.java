package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Herbivore;

/**
 * Instance class for Hippo
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Hippo implements Animal, Herbivore {
    private String name;
    private final String helloText;
    private final String eatText;

    /**
     * Constructor for Hippo
     *
     * @param name The name of the hippo
     */
    public Hippo(String name) {
        this.name = name;
        this.helloText = this.name + ": Splash, hello there!";
        this.eatText = this.name + ": Munch munch, lovely!";
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
}
