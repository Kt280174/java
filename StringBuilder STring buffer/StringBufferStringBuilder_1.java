public class StringBufferStringBuilderDemo {
    public static void main(String[] args) {
        // Демонстрация методов StringBuffer
        System.out.println("StringBuffer Methods:");

        // 1. append() - добавляет текст в конец строки
        StringBuffer sbBuffer = new StringBuffer("Hello");
        sbBuffer.append(" World!");
        System.out.println("append: " + sbBuffer);

        // 2. insert() - вставляет текст в указанную позицию
        sbBuffer.insert(5, ",");
        System.out.println("insert: " + sbBuffer);

        // 3. delete() - удаляет часть строки
        sbBuffer.delete(5, 6); // Удаляем запятую
        System.out.println("delete: " + sbBuffer);

        // 4. replace() - заменяет часть строки
        sbBuffer.replace(6, 11, "Java");
        System.out.println("replace: " + sbBuffer);

        // 5. reverse() - переворачивает строку
        sbBuffer.reverse();
        System.out.println("reverse: " + sbBuffer);

        // 6. capacity() - возвращает текущую ёмкость
        System.out.println("capacity: " + sbBuffer.capacity());

        // 7. ensureCapacity() - увеличивает ёмкость буфера
        sbBuffer.ensureCapacity(50);
        System.out.println("ensureCapacity: " + sbBuffer.capacity());

        // 8. charAt() - возвращает символ на указанной позиции
        System.out.println("charAt(5): " + sbBuffer.charAt(5));

        // 9. substring() - возвращает подстроку
        String subStringBuffer = sbBuffer.substring(5, 9);
        System.out.println("substring(5, 9): " + subStringBuffer);

        // 10. length() - возвращает длину строки
        System.out.println("length: " + sbBuffer.length());

        System.out.println("\nStringBuilder Methods:");

        // Демонстрация методов StringBuilder
        StringBuilder sbBuilder = new StringBuilder("Programming");

        // 1. append() - добавляет текст в конец строки
        sbBuilder.append(" in Java");
        System.out.println("append: " + sbBuilder);

        // 2. insert() - вставляет текст в указанную позицию
        sbBuilder.insert(12, " is fun");
        System.out.println("insert: " + sbBuilder);

        // 3. delete() - удаляет часть строки
        sbBuilder.delete(12, 19); // Удаляем " is fun"
        System.out.println("delete: " + sbBuilder);

        // 4. replace() - заменяет часть строки
        sbBuilder.replace(0, 11, "Coding");
        System.out.println("replace: " + sbBuilder);

        // 5. reverse() - переворачивает строку
        sbBuilder.reverse();
        System.out.println("reverse: " + sbBuilder);

        // 6. capacity() - возвращает текущую ёмкость
        System.out.println("capacity: " + sbBuilder.capacity());

        // 7. ensureCapacity() - увеличивает ёмкость буфера
        sbBuilder.ensureCapacity(40);
        System.out.println("ensureCapacity: " + sbBuilder.capacity());

        // 8. charAt() - возвращает символ на указанной позиции
        System.out.println("charAt(2): " + sbBuilder.charAt(2));

        // 9. substring() - возвращает подстроку
        String subStringBuilder = sbBuilder.substring(2, 5);
        System.out.println("substring(2, 5): " + subStringBuilder);

        // 10. length() - возвращает длину строки
        System.out.println("length: " + sbBuilder.length());
    }
}
