import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на идентичность ссылок
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null и совпадение классов
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. Приведение типа
        Person person = (Person) obj;

        // 4. Сравнение значений полей
        return Objects.equals(name, person.name) && age == person.age;
    }

    // Переопределение hashCode (рекомендуется переопределять вместе с equals)
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
    }
}
