package zoo.animals;
import zoo.interfaces.Walkable;

public class Reptile extends Animal implements Walkable {
    public Reptile(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " crawls slowly.");
    }
}
