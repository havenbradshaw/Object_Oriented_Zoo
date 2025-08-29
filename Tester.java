public class Tester {
    public static void main(String[] args) {
        Animal myMammal = new Mammal();
        Animal myBird = new Bird();
        Animal myReptile = new Reptile();

        myMammal.makeSound(); // Outputs: Hi!
        myBird.makeSound();   // Outputs: Chirp
        myReptile.makeSound(); // Outputs: Hiss
    }
}