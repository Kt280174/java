public class StringConcatenationExample {
    public static void main(String[] args) {
        // Переменная базового типа
        int num = 42;
        double pi = 3.14;

        // Объект другого типа
        Object obj = new Object();
        
        // Переменная строкового типа
        String text = "Hello";

        // Пример конкатенации строк с базовыми типами
        String result1 = text + " world, the answer is " + num;
        System.out.println(result1); // Вывод: Hello world, the answer is 42

        String result2 = "Pi is approximately " + pi;
        System.out.println(result2); // Вывод: Pi is approximately 3.14

        // Пример конкатенации строк с объектами
        String result3 = "Object info: " + obj;
        System.out.println(result3); // Вывод: Object info: java.lang.Object@<хэшкод>

        // Пример сложной конкатенации
        String result4 = text + " number: " + num + ", pi: " + pi + ", object: " + obj;
        System.out.println(result4);
        // Вывод: Hello number: 42, pi: 3.14, object: java.lang.Object@<хэшкод>
    }
}
