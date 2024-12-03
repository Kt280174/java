public class NarrowingWithoutChar {
    public static void main(String[] args) {
        // Пример 1: int -> byte
        int intValue = 150;
        byte byteValue = (byte) intValue; // int преобразуется в byte
        System.out.println("int -> byte: " + byteValue); // Вывод: -106 (переполнение)

        // Пример 2: long -> int
        long longValue = 3000000000L; // Значение выходит за пределы диапазона int
        int narrowedInt = (int) longValue; // long преобразуется в int
        System.out.println("long -> int: " + narrowedInt); // Вывод: -1294967296 (усечение)

        // Пример 3: double -> float
        double doubleValue = 123456789.987654321;
        float floatValue = (float) doubleValue; // double преобразуется в float
        System.out.println("double -> float: " + floatValue); // Вывод: 1.23456792E8 (потеря точности)

        // Пример 4: double -> int
        double largeDouble = 45.67;
        int truncatedInt = (int) largeDouble; // double преобразуется в int, дробная часть отбрасывается
        System.out.println("double -> int: " + truncatedInt); // Вывод: 45

        // Пример 5: short -> byte
        short shortValue = 257;
        byte narrowedByte = (byte) shortValue; // short преобразуется в byte
        System.out.println("short -> byte: " + narrowedByte); // Вывод: 1 (переполнение)

        // Пример 6: float -> int
        float floatNum = 9.99f;
        int intFromFloat = (int) floatNum; // float преобразуется в int, дробная часть отбрасывается
        System.out.println("float -> int: " + intFromFloat); // Вывод: 9
    }
}
