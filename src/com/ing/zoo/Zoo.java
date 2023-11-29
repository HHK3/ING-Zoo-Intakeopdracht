package com.ing.zoo;

import com.ing.zoo.animals.models.*;
import com.ing.zoo.animals.interfaces.*;

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
        List<String> commandList = Arrays.asList("hello", "give leafs", "give meat", "perform trick");

        // Create a list of Animals with the animals that are in the zoo
        List<Animal> animalList = new ArrayList<>(Arrays.asList(
            new Lion("Simba"),
            new Hippo("Dora"),
            new Pig("Pumba"),
            new Tiger("Khan"),
            new Zebra("Marty"),
            new Fox("Nick"),
            new Falcon("Falco")
        ));

        // Create a Scanner to read the input from the user
        Scanner scanner = new Scanner(System.in);

        // Boolean to check if the input is valid
        boolean validInput = false;

        // Set up a while loop to keep asking for input when validInput is false
        while(!validInput) {
            // Ask for input
            System.out.print("Enter here your desired command: ");
            String input = scanner.nextLine().toLowerCase();

            // Loop through the animalList and execute one of the commands based on input
            for (Animal animal : animalList) {
                // Create strings with the Hello-command and the Hello-command with the inputted name of the animal
                String helloCommand = commandList.get(0);
                String helloCommandWithName = helloCommand + " " + animal.getName().toLowerCase();

                if (input.matches(helloCommand) || input.matches(helloCommandWithName)) {
                    animal.sayHello(); // Let either all animals or one animal say hello
                    validInput = true;
                } else if (input.matches(commandList.get(1)) && (animal instanceof Herbivore)) {
                    ((Herbivore) animal).eatLeafs(); // Let all herbivores eat leafs
                    validInput = true;
                } else if (input.matches(commandList.get(2)) && (animal instanceof Carnivore)) {
                    ((Carnivore) animal).eatMeat(); // Let all carnivores eat meat
                    validInput = true;
                } else if (input.matches(commandList.get(3)) && (animal instanceof TrickAnimal)) {
                    ((TrickAnimal) animal).performTrick(); // Let all animals that can perform a trick perform a trick
                    validInput = true;
                }
            }

            // If the input is not valid, print an error message and ask for a new input
            if (!validInput) {
                System.out.println("Invalid input, please try again.\n");
            }
        }
    }
}
