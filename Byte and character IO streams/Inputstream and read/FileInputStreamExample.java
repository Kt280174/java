import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Предположим, файл "example.txt" существует

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;

            System.out.println("Содержимое файла:");

            // Читаем байты из файла до конца (read() возвращает -1 при достижении конца файла)
            while ((byteData = fis.read()) != -1) {
                // Преобразуем байт в символ и выводим
                System.out.print((char) byteData);
            }

        } catch (IOException e) {
            System.err.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}
