import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем и устанавливаем дефолтное значение
        StringJoiner joiner = new StringJoiner(", ");
        joiner.setEmptyValue("No elements");

        // Вывод пустого StringJoiner
        System.out.println("Пустой StringJoiner: " + joiner);

        // Добавляем строки
        joiner.add("Red");
        joiner.add("Green");
        joiner.add("Blue");

        // Вывод результата после добавления элементов
        System.out.println("StringJoiner после добавления элементов: " + joiner);
    }
}
