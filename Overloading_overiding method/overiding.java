class Animal {
    // Метод, который будет переопределен
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Вывод: Animal sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Вывод: Bark

        Animal myPet = new Dog();
        myPet.makeSound(); // Вывод: Bark (демонстрация полиморфизма)
    }
}