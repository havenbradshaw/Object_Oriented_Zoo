public class Bird extends Animal implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}