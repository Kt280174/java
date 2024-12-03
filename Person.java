/**
 * Класс, представляющий человека.
 */
public class Person {
    private String name;
    private int age;

    /**
     * Конструктор класса Person.
     *
     * @param name имя человека
     * @param age возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получает имя человека.
     *
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Получает возраст человека.
     *
     * @return возраст
     */
    public int getAge() {
        return age;
    }
}