package zoo.manager;
import java.util.ArrayList;
import java.util.Scanner;

import zoo.animals.Animal;
import zoo.interfaces.Flyable;
import zoo.interfaces.Walkable;

/**
 * Manages a collection of animals in the zoo and provides a menu for user interaction.
 */
public class ZooManager {

    final private Scanner scn = new Scanner(System.in);
    private ArrayList<Animal> animals = new ArrayList<>();
    private String order;

    /**
     * Constructs a ZooManager with a given list of animals.
     * @param animals the list of animals to manage
     */
    public ZooManager(ArrayList<Animal> animals){
        this.animals = animals;
    }

    /**
     * Displays the menu and processes user input for zoo actions.
     */
    public void getMenu(){
        while(true){
        System.out.println("What would you like to do?");
        System.out.println("1. List all");
        System.out.println("2. Make all move");
        System.out.println("3. Make all make noise");
        System.out.println("4. Exit");
        System.out.print("Enter your answer as the corresponding number: ");
        order = scn.nextLine();
            switch (order) {
                case "1" -> listAll();
        
                case "2" -> makeAllMove();
                    
                case "3" -> allNoise();
                    
                case "4" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
           
    }

    //list all method
    private void listAll(){
        int x = animals.size();
        for(int i = 0; i < x; i++){
        System.out.println(animals.get(i).getName());
        }
    }
    
    //make all move method
    private void makeAllMove(){
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getName());

            if (animal instanceof Walkable walkableAnimal) {
                walkableAnimal.walk();
            }

            if (animal instanceof Flyable flyableAnimal) {
                flyableAnimal.fly();
            }   
        }
    }
    
    //make all make noise
    private void allNoise(){
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
   
}
