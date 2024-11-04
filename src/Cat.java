public class Cat extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public void eat() {
        System.out.println("eat cat food");

    }

    @Override
    public void run() {
        System.out.println("cat run");
    }
}
