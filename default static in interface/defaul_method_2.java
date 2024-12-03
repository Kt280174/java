// Интерфейс 1 с дефолтным методом
interface Interface1 {
    default void display() {
        System.out.println("Display from Interface1");
    }
}

// Интерфейс 2 с дефолтным методом
interface Interface2 {
    default void display() {
        System.out.println("Display from Interface2");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements Interface1, Interface2 {
    // Переопределяем метод display, чтобы разрешить конфликт
    @Override
    public void display() {
        // Явно выбираем, какую реализацию использовать
        System.out.println("Display from MyClass (resolved conflict)");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
        // Вызовем метод display, который разрешает конфликт
        myClass.display();  // Выведет: Display from MyClass (resolved conflict)
    }
}
