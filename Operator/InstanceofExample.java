class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
interface Pet {}

class DogPet extends Dog implements Pet {}
class CatPet extends Cat implements Pet {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Pet pet = new DogPet();
        Dog dog = null;

        // Пример 1: Проверка с экземпляром класса Dog
        if (animal instanceof Dog) {
            System.out.println("animal is an instance of Dog.");
        } else {
            System.out.println("animal is not an instance of Dog.");
        }

        // Пример 2: Проверка с экземпляром класса Cat
        if (animal instanceof Cat) {
            System.out.println("animal is an instance of Cat.");
        } else {
            System.out.println("animal is not an instance of Cat.");
        }

        // Пример 3: Проверка с интерфейсом Pet
        if (pet instanceof Pet) {
            System.out.println("pet is an instance of Pet.");
        } else {
            System.out.println("pet is not an instance of Pet.");
        }

        // Пример 4: Проверка с null объектом
        if (dog instanceof Dog) {
            System.out.println("dog is an instance of Dog.");
        } else {
            System.out.println("dog is not an instance of Dog.");
        }
    }
}
