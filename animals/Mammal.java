package animals;

import interfaces.Walkable;


// Mammal class extending Animal and implementing Walkable interface
public class Mammal extends Animal implements Walkable {

    public Mammal(String name) {
        super(name);
    }

    // Implementing abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    // Implementing walk method from Walkable interface
    @Override
    public void walk() {
        System.out.println(getName() + " walks on four legs.");
    }
    
}
