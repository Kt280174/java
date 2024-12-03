
public class Main
{
	public static void main(String[] args) {
		int a = 10;
        int b = 5;
        double x = 3.5;
        boolean flag1 = true;
        boolean flag2 = false;

        // Операторы присваивания
        a += b; // a = a + b (10 + 5)
        System.out.println("a += b: " + a); // 15
        
        a -= 3; // a = a - 3 (15 - 3)
        System.out.println("a -= 3: " + a); // 12
        
        a *= 2; // a = a * 2 (12 * 2)
        System.out.println("a *= 2: " + a); // 24
        
        a /= 4; // a = a / 4 (24 / 4)
        System.out.println("a /= 4: " + a); // 6
        
        a %= 5; // a = a % 5 (6 % 5)
        System.out.println("a %= 5: " + a); // 1

        // Унарные операторы: ++ и --
        int c = 5;
        System.out.println("Префиксный инкремент: " + (++c)); // 6) 
        System.out.println("Постфиксный инкремент: " + (c++)); // 6, затем c = 7
        System.out.println("c после постфиксного инкремента: " + c); // 7
        
        c = 5;
        System.out.println("Префиксный декремент: " + (--c)); // 4) 
        System.out.println("Постфиксный декремент: " + (c--)); // 4, затем c = 3
        System.out.println("c после постфиксного декремента: " + c); // 3

        // Арифметические операторы
        int sum = a + b; // Сложение
        System.out.println("Сложение: " + sum); // 1 + 5 = 6
        
        int difference = a - b; // Вычитание
        System.out.println("Вычитание: " + difference); // 1 - 5 = -4
        
        int product = a * b; // Умножение
        System.out.println("Умножение: " + product); // 1 * 5 = 5
        
        double division = (double) a / b; // Деление
        System.out.println("Деление: " + division); // 1 / 5 = 0.2
        
        int remainder = a % b; // Остаток
        System.out.println("Остаток от деления: " + remainder); // 1 % 5 = 1
        
        // Побитовые операции
        int bitwiseAnd = a & b; // Побитовое И
        System.out.println("Побитовое И: " + bitwiseAnd);
        
        int bitwiseOr = a | b; // Побитовое ИЛИ
        System.out.println("Побитовое ИЛИ: " + bitwiseOr);
        
        int bitwiseXor = a ^ b; // Побитовое исключающее ИЛИ
        System.out.println("Побитовое исключающее ИЛИ: " + bitwiseXor);
        
        // Логические операции
        boolean andResult = flag1 && flag2; // Логическое И
        System.out.println("Логическое И: " + andResult); // false
        
        boolean orResult = flag1 || flag2; // Логическое ИЛИ
        System.out.println("Логическое ИЛИ: " + orResult); // true

        // Операторы сравнения
        boolean equal = (a == b); // Равно
        System.out.println("Равно: " + equal); // false
        
        boolean notEqual = (a != b); // Не равно
        System.out.println("Не равно: " + notEqual); // true

        boolean greaterThan = (a > b); // Больше
        System.out.println("Больше: " + greaterThan); // false
        
        boolean lessThan = (a < b); // Меньше
        System.out.println("Меньше: " + lessThan); // true
        
        boolean greaterOrEqual = (a >= b); // Больше или равно
        System.out.println("Больше или равно: " + greaterOrEqual); // false
        
        boolean lessOrEqual = (a <= b); // Меньше или равно
        System.out.println("Меньше или равно: " + lessOrEqual); // true
        
        // Побитовые сдвиги
        int leftShift = a << 1; // Левый сдвиг
        System.out.println("Левый сдвиг: " + leftShift); // 2 * a
        
        int rightShift = a >> 1; // Правый сдвиг
        System.out.println("Правый сдвиг: " + rightShift); // a / 2
        
        int logicalRightShift = a >>> 1; // Логический правый сдвиг
        System.out.println("Логический правый сдвиг: " + logicalRightShift); // a / 2
        
        // Операции со строками
        String str1 = "Hello";
        String str2 = "World";

        // Конкатенация строк с использованием +
        String concatenated = str1 + " " + str2; // "Hello World"
        System.out.println("Конкатенация: " + concatenated);
        
        // Длина строки
        int length = concatenated.length();
        System.out.println("Длина строки: " + length); // 11
        
        // Сравнение строк
        boolean isEqual = str1.equals("Hello");
        System.out.println("str1 равна 'Hello': " + isEqual); // true

        // Проверка наличия подстроки
        boolean contains = concatenated.contains("lo W");
        System.out.println("Содержит 'lo W': " + contains); // true

        // Присваивание/переопределение
        str1 += " Everyone"; // str1 становится "Hello Everyone"
        System.out.println("Изменение str1: " + str1); // "Hello Everyone"
	}
}