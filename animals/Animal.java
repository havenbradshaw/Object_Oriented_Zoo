package animals;

/**
 * Abstract base class representing an animal in the zoo.
 * All animals have a name and can make a sound.
 */
public abstract class Animal {
    private final String name;

    /**
     * Constructs an Animal with the specified name.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * Makes the animal produce its characteristic sound.
     */
    public abstract void makeSound();
}