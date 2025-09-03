package zoo.manager;

import java.util.ArrayList;

import zoo.animals.Animal;
import zoo.animals.Bird;
import zoo.animals.Mammal;
import zoo.animals.Reptile;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Dog"));
        animals.add(new Bird("Conure"));
        animals.add(new Reptile("Python"));
        
        //make a ZooManager object (all methods can now be called from this object)
        ZooManager zoo = new ZooManager(animals);
        zoo.getMenu();

    }
}
