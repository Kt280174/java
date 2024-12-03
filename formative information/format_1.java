public class Main {
    public static void main(String[] args) {
        boolean isAvailable = true;
        char grade = 'A';
        int quantity = 42;
        double price = 19.99;
        String itemName = "Apple";

        // Форматирование строки с использованием различных спецификаторов
        String formattedString = String.format(
            "Item: %s\n" +                       // %s — строковое представление
            "Quantity: %d\n" +                   // %d — десятичное целое значение
            "Price: $%.2f\n" +                   // %.2f — десятичное значение с плавающей точкой (2 знака после запятой)
            "Available: %b\n" +                  // %b — логическое значение
            "Grade: %c\n",                       // %c — символьное представление
            itemName, quantity, price, isAvailable, grade
        );

        // Вывод форматированной строки
        System.out.println(formattedString);
    }
}