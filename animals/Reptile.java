package animals;

import interfaces.Walkable;

/**
 * Represents a reptile in the zoo.
 * Reptiles can walk and make a hissing sound.
 */
public class Reptile extends Animal implements Walkable {
    /**
     * Constructs a Reptile with the specified name.
     */
    public Reptile(String name) {
        super(name);
    }

    /**
     * Makes the reptile produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }

    /**
     * Makes the reptile walk.
     */
    @Override
    public void walk() {
        System.out.println(getName() + " crawls slowly.");
    }
}
