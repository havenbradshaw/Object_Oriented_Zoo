package zoo.manager;

import java.util.ArrayList;

import zoo.animals.Animal;
import zoo.animals.Bird;
import zoo.animals.Mammal;
import zoo.animals.Reptile;

/** This Main class adds objects to the array "animals" and puts this array into the ZooManager object 
 * "zoo" as a parameter, allowing the array to be handled through the menu the ZooManager class sets up*/
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
