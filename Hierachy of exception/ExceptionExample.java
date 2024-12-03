public class ExceptionExample {
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст установлен: " + age);
    }
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль! " + e.getMessage());
        }
        int [] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: Выход за пределы массива! " + e.getMessage());
        }
        try {
            setAge(-5);
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: "+ e.getMessage());
        }
        Object obj = "Строка";
        try{
            Integer number = (Integer) obj;
        } catch (ClassCastException e){
            System.out.println("Ошибка: Неверное приведение типа! " + e.getMessage());
        }
        String str = null;
        try {
            System.out.println(str.length()); // Доступ к методу объекта, равного null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Обращение к null! " + e.getMessage());
        }
    }
}