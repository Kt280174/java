// Объявляем класс как final
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Попытка создать подкласс приведет к ошибке компиляции

/*class SubClass extends FinalClass {
    public void show() {
        System.out.println("Trying to extend a final class.");
    }
}*/


public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Вывод: This is a final class.
    }
}
