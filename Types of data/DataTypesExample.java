public class DataTypesExample {
    public static void main(String[] args) {
        // Целочисленные типы
        byte byteValue = 0;           // Нулевое значение
        byte maxByte = 127;           // Максимальное значение для byte
        byte minByte = -128;          // Минимальное значение для byte

        short shortValue = 0;         // Нулевое значение
        short maxShort = 32767;       // Максимальное значение для short
        short minShort = -32768;      // Минимальное значение для short

        int intValue = 0;             // Нулевое значение
        int maxInt = 2147483647;      // Максимальное значение для int
        int minInt = -2147483648;     // Минимальное значение для int

        long longValue = 0L;          // Нулевое значение
        long maxLong = 9223372036854775807L;  // Максимальное значение для long
        long minLong = -9223372036854775808L; // Минимальное значение для long

        // С плавающей точкой
        float floatValue = 0.0f;      // Нулевое значение
        float someFloat = 3.14f;      // Пример значения

        double doubleValue = 0.0;     // Нулевое значение
        double someDouble = 3.14159265359; // Пример значения

        // Символьный
        char charValue = '\u0000';    // Нулевое значение (нулевой символ Unicode)
        char someChar = 'A';          // Пример символа

        // Булевский
        boolean boolValue = false;    // Нулевое значение
        boolean isTrue = true;        // Пример значения

        // Вывод всех значений
        System.out.println("Целочисленные типы:");
        System.out.println("byte: " + byteValue + ", max: " + maxByte + ", min: " + minByte);
        System.out.println("short: " + shortValue + ", max: " + maxShort + ", min: " + minShort);
        System.out.println("int: " + intValue + ", max: " + maxInt + ", min: " + minInt);
        System.out.println("long: " + longValue + ", max: " + maxLong + ", min: " + minLong);

        System.out.println("\nС плавающей точкой:");
        System.out.println("float: " + floatValue + ", пример: " + someFloat);
        System.out.println("double: " + doubleValue + ", пример: " + someDouble);

        System.out.println("\nСимвольный тип:");
        System.out.println("char: " + charValue + " (нулевой символ), пример: " + someChar);

        System.out.println("\nБулевский тип:");
        System.out.println("boolean: " + boolValue + ", пример: " + isTrue);
    }
}
