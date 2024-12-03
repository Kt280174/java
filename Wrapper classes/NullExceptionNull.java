public class Main {
    public static void main(String[] args) {
        Integer integerObj = null;  // Объект Integer равен null

        // Попытка распаковки (автораспаковка) значения из null-объекта
        try {
            int value = integerObj;  // Это приведет к NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e);  // Вывод: Ошибка: java.lang.NullPointerException
        }
        
        Boolean booleanObj = null;  // Объект Boolean равен null

        // Попытка вызова метода на null объекте
        try {
            if (booleanObj) {  // Здесь происходит авторспаковка
                System.out.println("True");
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e);  // Вывод: Ошибка: java.lang.NullPointerException
        }
    }
}
