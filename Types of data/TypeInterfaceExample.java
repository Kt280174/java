public class TypeInterfaceExample {
    public static void main(String[] args) {
        // Пример 1: Использование var с целочисленными значениями
        var number = 10; // Компилятор выводит тип переменной как int
        System.out.println("Тип переменной number: " + ((Object) number).getClass().getSimpleName());
        
        // Пример 2: Использование var со строками
        var text = "Hello, World!"; // Компилятор выводит тип переменной как String
        System.out.println("Тип переменной text: " + ((Object) text).getClass().getSimpleName());

        // Пример 3: Использование var с коллекциями
        var list = java.util.List.of(1, 2, 3, 4); // Компилятор выводит тип переменной как List<Integer>
        System.out.println("Тип переменной list: " + list.getClass().getSimpleName());

        // Пример 4: var с пользовательскими классами
        var person = new Person("Alice", 25); // Компилятор выводит тип как Person
        System.out.println("Тип переменной person: " + person.getClass().getSimpleName());
    }
}

// Вспомогательный класс
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
