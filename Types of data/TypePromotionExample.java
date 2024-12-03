public class TypePromotionExample {
    public static void main(String[] args) {
        // Пример 1: byte + int
        byte b = 10;
        int i = 20;
        int result1 = b + i; // byte автоматически преобразуется в int
        System.out.println("byte + int = " + result1); // Вывод: 30

        // Пример 2: int + long
        int num = 100;
        long bigNum = 1000L;
        long result2 = num + bigNum; // int преобразуется в long
        System.out.println("int + long = " + result2); // Вывод: 1100

        // Пример 3: float + double
        float f = 1.5f;
        double d = 2.5;
        double result3 = f + d; // float преобразуется в double
        System.out.println("float + double = " + result3); // Вывод: 4.0

        // Пример 4: char + int
        char c = 'A'; // Символ 'A', код в Unicode: 65
        int number = 5;
        int result4 = c + number; // char преобразуется в int
        System.out.println("char + int = " + result4); // Вывод: 70

        // Пример 5: byte + short
        byte small = 50;
        short medium = 100;
        int result5 = small + medium; // byte и short преобразуются в int
        System.out.println("byte + short = " + result5); // Вывод: 150
    }
}
