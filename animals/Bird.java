package animals;

import interfaces.Flyable;
import interfaces.Walkable;

/**
 * Represents a bird in the zoo.
 * Birds can fly, walk, run, and make a chirping sound.
 */
public class Bird extends Animal implements Flyable, Walkable {
    /**
     * Constructs a Bird with the specified name.
     */
    public Bird(String name) {
        super(name);
    }

    /**
     * Makes the bird produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    /**
     * Makes the bird fly.
     */
    @Override
    public void fly() {
        System.out.println(getName() + " flies with its wings.");
    }

    /**
     * Makes the bird walk.
     */
    @Override
    public void walk(){
        System.out.println(getName() + " walks with two legs");
    }

    @Override
    public void run(){
        System.out.println(getName() + " runs before it flies");
    }
}
