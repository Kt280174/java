public class DayOfWeekExample {

    // Собственное перечисление
    public enum DayOfWeek {
        MONDAY("Рабочий день"),
        TUESDAY("Рабочий день"),
        WEDNESDAY("Рабочий день"),
        THURSDAY("Рабочий день"),
        FRIDAY("Рабочий день"),
        SATURDAY("Выходной"),
        SUNDAY("Выходной");

        private final String description; // Описание дня

        // Конструктор перечисления
        DayOfWeek(String description) {
            this.description = description;
        }

        // Метод для получения описания дня
        public String getDescription() {
            return description;
        }

        // Дополнительный метод: проверяет, является ли день рабочим
        public boolean isWorkingDay() {
            return this != SATURDAY && this != SUNDAY;
        }
    }

    // Метод для демонстрации работы с перечислением
    public static void main(String[] args) {
        // Перебор всех дней недели
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.name() + ": " + day.getDescription() +
                    " (Рабочий день? " + day.isWorkingDay() + ")");
        }
    }
}
