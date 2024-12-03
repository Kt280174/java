import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с консоли
        Scanner scan = new Scanner(System.in);
        
        // Запрашиваем имя у пользователя
        System.out.print("Введите ваше имя: ");
        String name = scan.next();
        
        // Выводим приветствие с введенным именем
        System.out.println("Привет, " + name + "!");
        
        // Закрытие Scanner
        scan.close();
    }
}
