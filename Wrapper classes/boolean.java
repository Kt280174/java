public class Main {
    public static void main(String[] args) {
        //1. Использование конструктора (не рекомендуется)
        Boolean booleanObj = new Boolean(true);
        System.out.println(booleanObj); // Вывод: true
        
        //2. Создание экземпляра с использованием valueOf
        booleanObj = Boolean.valueOf(true);
        System.out.println(booleanObj); // Вывод: true
        
        //3. Использование valueOf с строкой
        Boolean booleanObj1 = Boolean.valueOf("true");
        Boolean booleanObj2 = Boolean.valueOf("false");
        Boolean booleanObj3 = Boolean.valueOf("something else"); // Не "true" => false

        System.out.println(booleanObj1); // Вывод: true
        System.out.println(booleanObj2); // Вывод: false
        System.out.println(booleanObj3); // Вывод: false
        
        //4. Автобоксинг
        booleanObj = true; // Примитив boolean автоматически превращается в объект Boolean

        System.out.println(booleanObj); // Вывод: true
        
        //5.  Использование parseBoolean
        boolean b1 = Boolean.parseBoolean("true");
        boolean b2 = Boolean.parseBoolean("false");
        boolean b3 = Boolean.parseBoolean("something else"); // Не "true" => false

        System.out.println(b1); // Вывод: true
        System.out.println(b2); // Вывод: false
        System.out.println(b3); // Вывод: false
    }
}
