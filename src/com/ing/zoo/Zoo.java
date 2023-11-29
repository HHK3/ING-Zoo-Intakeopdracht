package com.ing.zoo;

import com.ing.zoo.animals.models.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.setName("Henk");

        Hippo elsa = new Hippo();
        elsa.setName("Elsa");

        Pig dora = new Pig();
        dora.setName("Dora");

        Tiger wally = new Tiger();
        wally.setName("Wally");

        Zebra marty = new Zebra();
        marty.setName("Marty");

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
