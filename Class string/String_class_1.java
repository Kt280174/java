public class StringMethodsDemo {
    public static void main(String[] args) {
        // Исходная строка
        String originalString = "Hello, World!";
        
        // 1. toUpperCase() - Возвращает строку в верхнем регистре
        String upperCase = originalString.toUpperCase();
        System.out.println("1. toUpperCase(): " + upperCase);
        
        // 2. toLowerCase() - Возвращает строку в нижнем регистре
        String lowerCase = originalString.toLowerCase();
        System.out.println("2. toLowerCase(): " + lowerCase);
        
        // 3. replace() - Заменяет одну подстроку на другую
        String replacedString = originalString.replace("World", "Java");
        System.out.println("3. replace(): " + replacedString);
        
        // 4. split() - Разделяет строку на массив строк по указанному разделителю
        String[] splitArray = originalString.split(", ");
        System.out.println("4. split(): " + String.join(" | ", splitArray));
        
        // 5. join() - Объединяет строки из массива в одну строку с разделителем
        String joinedString = String.join(", ", "Java", "is", "awesome");
        System.out.println("5. join(): " + joinedString);
        
        // 6. indexOf() - Возвращает индекс первого вхождения подстроки
        int index = originalString.indexOf("World");
        System.out.println("6. indexOf(): " + index);
        
        // 7. substring() - Возвращает подстроку, начиная с указанного индекса
        String substring = originalString.substring(7);
        System.out.println("7. substring(): " + substring);
        
        // 8. trim() - Удаляет начальные и конечные пробелы из строки
        String stringWithSpaces = "   Hello, Java!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("8. trim(): '" + trimmedString + "'");
        
        // 9. startsWith() - Проверяет, начинается ли строка с указанного префикса
        boolean startsWith = originalString.startsWith("Hello");
        System.out.println("9. startsWith(): " + startsWith);
        
        // 10. length() - Возвращает длину строки
        int length = originalString.length();
        System.out.println("10. length(): " + length);
    }
}
