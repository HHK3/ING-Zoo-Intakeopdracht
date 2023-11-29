package com.ing.zoo.animals.models;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.interfaces.Carnivore;

/**
 * Instance class for Lion
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Lion implements Animal, Carnivore {
    private String name;
    private final String helloText;
    private final String eatText;

    // Constructor for Lion
    public Lion() {
        this.helloText = "Roarrrr!";
        this.eatText = "Nomnomnom, thnx mate!";
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
}
