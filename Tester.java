public class Tester {
    public static void main(String[] args) {
        Animal myMammal = new Mammal("Dog");
        Animal myBird = new Bird("Raven");
        Animal myReptile = new Reptile("Bearded Dragon");

        myMammal.makeSound(); // Outputs: Hi!
        myBird.makeSound();   // Outputs: Chirp
        myReptile.makeSound(); // Outputs: Hiss
    }
}