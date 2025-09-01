abstract class Animal {  
    protected String species;

    protected Animal(String species) {
        this.species = species;
    }

    abstract void makeSound();
}