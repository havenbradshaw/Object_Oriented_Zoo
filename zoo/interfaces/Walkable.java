package zoo.interfaces;
public interface Walkable {
    default void walk() {
        System.out.println("Step");
    }
}