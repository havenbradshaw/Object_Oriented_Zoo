import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Dog"));
        animals.add(new Bird("Conure"));
        animals.add(new Reptile("Python"));

        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getName());

            animal.makeSound();

            if (animal instanceof Flyable flyableAnimal) {
            flyableAnimal.fly();
            }   

            if (animal instanceof Walkable walkableAnimal) {
                walkableAnimal.walk();
            }

            if (animal instanceof Sunbathes sunbathingAnimal) {
                sunbathingAnimal.sunbathe();    
            }

            System.out.println();

            }
    }
}