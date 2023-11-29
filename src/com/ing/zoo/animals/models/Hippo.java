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

    public Hippo() {
        this.helloText = "Splash, hello there!";
        this.eatText = "Munch munch, lovely!";
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
    public void eatLeafs() {
        System.out.println(eatText);
    }
}
