public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения (будет перехвачено)
            System.out.println("Генерация первого исключения:");
            int result = 10 / 0; // ArithmeticException (деление на ноль)
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            // Обработка первого исключения
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Генерация второго исключения (не будет перехвачено, программа аварийно завершится)
        System.out.println("Генерация второго исключения:");
        String str = null;
        System.out.println(str.length()); // NullPointerException (обращение к null объекту)
    }
}
