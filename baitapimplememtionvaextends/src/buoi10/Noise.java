package src.buoi10;

public class Noise {
    public static void main(String[] args) {
        Animal dsAnimal = new Animal(4);
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        dsAnimal[0] = dog;
        dsAnimal[1] = dog2;
        dsAnimal[2] = cat;
        dsAnimal[3] = cat2;
        for (Animal animal : dsAnimal) {
            animal.makeNoise();
        }

    }
}
