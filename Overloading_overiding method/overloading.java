class Printer {
    // Метод для печати строки
    public void print(String message) {
        System.out.println("String: " + message);
    }

    // Метод для печати целого числа
    public void print(int number) {
        System.out.println("Integer: " + number);
    }

    // Метод для печати числа с плавающей запятой
    public void print(double value) {
        System.out.println("Double: " + value);
    }

    // Метод для печати массива строк
    public void print(String[] messages) {
        System.out.println("Array of Strings:");
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Вызов перегруженных методов
        printer.print("Hello, world!"); // Вызов метода с строкой
        printer.print(42);                // Вызов метода с целым числом
        printer.print(3.14);              // Вызов метода с числом с плавающей запятой

        String[] messages = {"First", "Second", "Third"};
        printer.print(messages);           // Вызов метода с массивом строк
    }
}