package main;

import animals.Animal;
import animals.Bird;
import animals.Mammal;
import animals.Reptile;
import java.util.ArrayList;


// Main class to demonstrate the zoo management system
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Adding different types of animals to the list
        animals.add(new Mammal("Dog"));
        animals.add(new Bird("Conure"));    
        animals.add(new Reptile("Snake"));

        // Creating a ZooManager instance and adding animals to the zoo
        ZooManager zooManager = new ZooManager();
        for (Animal animal : animals) {
            zooManager.addAnimal(animal);
        }

        // Interacting with the animals in the zoo
        zooManager.interactWithAnimal();
    }
}