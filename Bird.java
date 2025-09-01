public class Bird extends Animal implements Flyable {
    private String color;

    public Bird(String species){
        super(species);
     }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void fly() {
        System.out.println(species + " is flying!");
    }

    public String getColor(){
        return color;
    }
        public void setColor(String color){
        this.color = color;
    }
}