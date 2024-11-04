public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("twisk twisk");
    }

    @Override
    public void eat() {
        System.out.println("eat bird food");

    }

    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
