package animals;

import interfaces.Walkable;

/**
 * Represents a mammal in the zoo.
 * Mammals can walk, run, and make a barking sound.
 */
public class Mammal extends Animal implements Walkable {

    /**
     * Constructs a Mammal with the specified name.
     */
    public Mammal(String name) {
        super(name);
    }

    /**
     * Makes the mammal produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    /**
     * Makes the mammal walk.
     */
    @Override
    public void walk() {
        System.out.println(getName() + " walks on four legs.");
    }

    /**
     * Makes the mammal run.
     */
    @Override
    public void run() {
        System.out.println(getName() + " runs with the wind.");
    }
    
}
