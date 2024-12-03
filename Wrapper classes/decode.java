public class Main {
    public static void main(String[] args) {
        // Декодирование отрицательного шестнадцатеричного числа
        Integer value = Integer.decode("-0x1A");

        System.out.println("Декодированное значение: " + value); // Вывод: -26
    }
}
