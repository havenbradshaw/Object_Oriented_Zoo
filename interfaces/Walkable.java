package interfaces;

public interface Walkable {
    default void walk() {
        System.out.println("Can walk on it's legs as well");
    }
}