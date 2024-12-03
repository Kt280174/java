// Интерфейс с дефолтным и статическим методами
interface MyInterface {
    // Неабстрактный метод с реализацией (default method)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

// Класс, реализующий интерфейс MyInterface
class MyClass implements MyInterface {
    // Не нужно переопределять defaultMethod, так как он уже определен в интерфейсе
}

public class Main {
    public static void main(String[] args) {
        // Вызов статического метода интерфейса
        System.out.println("Calling static method:");
        MyInterface.staticMethod();

        // Создание объекта класса, реализующего интерфейс
        MyClass myObject = new MyClass();

        // Вызов дефолтного метода через объект класса
        System.out.println("\nCalling default method through an object:");
        myObject.defaultMethod();

        // Вызов дефолтного метода через интерфейс
        System.out.println("\nCalling default method through the interface reference:");
        MyInterface myInterface = new MyClass();
        myInterface.defaultMethod();
    }
}
