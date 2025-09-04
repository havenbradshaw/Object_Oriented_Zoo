package interfaces;


// Sunbathes interface with a default sunbathe method
public interface Sunbathes {
    default void sunbathe() {
        System.out.println("Likes to sunbathe");
    }
}
