package com.ing.zoo;

import com.ing.zoo.animals.interfaces.Animal;
import com.ing.zoo.animals.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Main class for the Zoo
 *
 * @author Joël Lakhai
 * @version 1.0
 */
public class Zoo {
    public static void main(String[] args) {
        // The commands that are available to use
        String[] commands = {"hello", "give leafs", "give meat", "performTrick"};

        // Create a list of Animals with the animals that are in the zoo
        List<Animal> animals = new ArrayList<>(Arrays.asList(
            new Lion("Simba"),
            new Hippo("Dora"),
            new Pig("Pumba"),
            new Tiger("Khan"),
            new Zebra("Marty"),
            new Fox("Nick"),
            new Falcon("Falco")
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0] + " dora")) {
            dora.sayHello();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
