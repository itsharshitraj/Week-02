package assistedproblems.animalkingdom;

public class AnimalHierarchy {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Bird bird = new Bird();
        bird.makeSound();
    }
}