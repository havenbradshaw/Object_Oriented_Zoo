package interfaces;


// Flyable interface with a default fly method
public interface Flyable {
    default void fly() {
        System.out.println("Flap");
    }
}