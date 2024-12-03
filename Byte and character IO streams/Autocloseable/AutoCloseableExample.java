import java.io.*;

// Пример пользовательского класса, реализующего AutoCloseable
class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Ресурс освобожден!");
    }

    public void use() {
        System.out.println("Ресурс используется.");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        // Пример работы с встроенными классами, реализующими AutoCloseable
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            // Чтение первой строки из файла
            String line = reader.readLine();
            System.out.println("Содержимое файла: " + line);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
        // Ресурс (BufferedReader) закроется автоматически

        // Пример работы с пользовательским ресурсом
        try (MyResource resource = new MyResource()) {
            resource.use();
        }
        // Ресурс (MyResource) закроется автоматически
    }
}