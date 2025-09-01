public class Reptile extends Animal {
    
    public Reptile(String species){
        super(species);
     }

    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }
}