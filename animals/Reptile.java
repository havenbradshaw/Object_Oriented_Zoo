package animals;

import interfaces.Sunbathes;
import interfaces.Walkable;


// Reptile class extending Animal and implementing Walkable and Sunbathes interfaces
public class Reptile extends Animal implements Walkable, Sunbathes{
    public Reptile(String name) {
        super(name);
    }

    // Implementing abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Hiss!");
    }

    // Implementing walk method from Walkable interface
    @Override
    public void walk() {
        System.out.println(getName() + " crawls slowly.");
    }
}
