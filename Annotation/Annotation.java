import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    @Deprecated
    public void oldBehavior() {
        System.out.println("This behavior is outdated");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    @SuppressWarnings({"unchecked", "deprecation"})
    public static void main(String[] args) {
        // Пример @Override
        Animal myDog = new Dog();
        myDog.makeSound(); // Выведет "Bark"

        // Пример @Deprecated
        myDog.oldBehavior(); // Использование устаревшего метода

        // Пример @SuppressWarnings
        List list = new ArrayList(); // Небезопасное приведение типов
        list.add("Hello");
        String message = (String) list.get(0); // Подавляется предупреждение "unchecked"
        System.out.println(message);
    }
}
