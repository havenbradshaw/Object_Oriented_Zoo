package animals;

import interfaces.Flyable;
import interfaces.Walkable;


// Bird class extending Animal and implementing Flyable and Walkable interfaces
public class Bird extends Animal implements Flyable, Walkable {
    public Bird(String name) {
        super(name);
    }


    // Implementing abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies with its wings.");
    }
}
