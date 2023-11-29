package com.ing.zoo.animals.interfaces;

/**
 * Interface class for Animal
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public interface Animal {
    // Method that retrieves the name of the animal
    String getName();

    // Method that sets the name for the animal
    void setName(String name);

    // Method that lets the animal say hello
    void sayHello();
}
