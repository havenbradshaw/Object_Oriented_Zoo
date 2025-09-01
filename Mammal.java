public class Mammal extends Animal implements Walkable {
    
    public Mammal(String species){
        super(species);
     }
    @Override
    public void makeSound() {
        System.out.println("Hi!");
    }
    public void walk(){
        System.out.println(species + " is walking");
    }
    
}
