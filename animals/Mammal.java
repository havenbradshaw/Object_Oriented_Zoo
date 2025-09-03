package animals;

import interfaces.Walkable;

public class Mammal extends Animal implements Walkable {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks on four legs.");
    }
    
}
