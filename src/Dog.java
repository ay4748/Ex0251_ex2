public class Dog extends Animal implements Runnable{

    @Override
    public void makeSound() {
        System.out.println("bark bark");
    }

    @Override
    public void eat() {
        System.out.println("eat dog food");

    }

    @Override
    public void run() {
        System.out.println("dog running");
    }
}
