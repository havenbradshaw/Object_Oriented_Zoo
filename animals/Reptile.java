package animals;

import interfaces.Sunbathes;
import interfaces.Walkable;

public class Reptile extends Animal implements Walkable, Sunbathes{
    public Reptile(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hiss!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " crawls slowly.");
    }
}
