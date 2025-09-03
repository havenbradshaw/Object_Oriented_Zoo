package animals;

import interfaces.Flyable;
import interfaces.Walkable;

public class Bird extends Animal implements Flyable, Walkable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies with its wings.");
    }
}
