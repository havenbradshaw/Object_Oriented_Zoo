package interfaces;
public interface Walkable {
    default void walk() {
        System.out.println("Step");
    }
    
    //second interface needs multiple methods
    default void run(){
        System.out.println("Run");
    }
}