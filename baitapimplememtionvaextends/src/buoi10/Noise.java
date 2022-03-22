package buoi10;

public class Noise {
    public static void main(String[] args) {
        Animal dsAnimal = new Animal();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        dsAnimal = dog;
        dsAnimal = dog2;
        dsAnimal = cat;
        dsAnimal = cat2;
        for (Animal animal : dsAnimal) {
            animal.makeNoise();
        }

    }
}
