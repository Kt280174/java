class Animal {
    // Метод, который должен быть переопределен в подклассе
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    // Неправильная сигнатура метода
    @Override
    public void makeNoize() {  // Ошибка! Метод должен быть makeSound(), а не makeNoize().
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Это вызовет ошибку компиляции из-за неправильного метода в Dog
    }
}
