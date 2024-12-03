import java.util.Date;

public class DateFormatterExample {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Date currentDate = new Date();

        // Форматируем с использованием спецификаторов
        String formattedOutput = String.format(
            "Часы (24-часовой формат): %tH\n" +      // Часы в 24-часовом формате
            "Часы (12-часовой формат): %tI\n" +      // Часы в 12-часовом формате
            "Минуты: %tM\n" +                        // Минуты
            "Полное название месяца: %tB\n" +        // Полное название месяца
            "Год в четырехзначном формате: %tY",     // Год в четырехзначном формате
            currentDate, currentDate, currentDate, currentDate, currentDate
        );

        // Выводим результат
        System.out.println(formattedOutput);
    }
}
