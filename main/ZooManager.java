package main;

import animals.Animal;
import interfaces.Flyable;
import interfaces.Walkable;
import java.util.ArrayList;
import java.util.Scanner;


// ZooManager class to manage the zoo operations
public class ZooManager {
    
    private final ArrayList<Animal> animals;
    private final Scanner scanner;


    // Constructor to initialize the ZooManager
    public ZooManager() {
        animals = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add an animal to the zoo
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }


    // Method to list all animals in the zoo
    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return;
        }

        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getName());
        }
    }


    // Method to interact with a selected animal
    public void interactWithAnimal() {
        listAnimals();
        if (animals.isEmpty()) return;

        int choice = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Select an animal by number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine()); // safer than nextInt()

                if (choice < 1 || choice > animals.size()) {
                    System.out.println("Invalid choice. Please select a number between 1 and " + animals.size() + ".");
                } else {
                    validInput = true; // valid number
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        Animal selectedAnimal = animals.get(choice - 1);
        System.out.println("You selected: " + selectedAnimal.getName());
        selectedAnimal.makeSound();

        if (selectedAnimal instanceof Flyable flyableAnimal) {
            flyableAnimal.fly();
        }

        if (selectedAnimal instanceof Walkable walkableAnimal) {
            walkableAnimal.walk();
        }
    }

}