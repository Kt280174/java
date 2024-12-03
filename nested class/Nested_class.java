interface MyInterface {
    // Статический вложенный класс
    class StaticNestedClass {
        public void display() {
            System.out.println("Hello from Static Nested Class inside MyInterface");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра статического вложенного класса
        MyInterface.StaticNestedClass nestedClass = new MyInterface.StaticNestedClass();
        nestedClass.display();  // Вызов метода вложенного класса
    }
}
