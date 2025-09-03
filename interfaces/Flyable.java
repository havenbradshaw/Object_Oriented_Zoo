package interfaces;

public interface Flyable {
    default void fly() {
        System.out.println("Flap");
    }
}