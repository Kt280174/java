import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Укажите путь к текстовому файлу
        File file = new File("example_1.txt");

        try (Scanner scanner = new Scanner(file)) {
            // Чтение данных из файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + file.getAbsolutePath());
        }
    }
}
