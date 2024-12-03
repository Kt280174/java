import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Файл, в который будут записаны данные
        String data = "Hello, OutputStream!";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            System.out.println("Запись данных в файл:");

            // Записываем каждый символ строки в файл
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i)); // Метод write(int) записывает один байт (символ)
                System.out.print(data.charAt(i)); // Для демонстрации выводим записываемый символ
            }

            System.out.println("\nДанные успешно записаны в файл: " + filePath);

        } catch (IOException e) {
            System.err.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}
