package main;
import animals.Animal;
import animals.Bird;
import animals.Mammal;
import animals.Reptile;
import java.util.ArrayList;

public class Main {
    public static void Main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Dog"));
        animals.add(new Bird("Conure"));
        animals.add(new Reptile("Python"));
        
        //make a ZooManager object (all methods can now be called from this object)
        ZooManager zoo = new ZooManager(animals);
        zoo.getMenu();

    }
}