class SuperClass {
    // Поле суперкласса
    protected String message;

    // Конструктор суперкласса
    public SuperClass(String message) {
        this.message = message;
    }

    // Метод суперкласса
    public void displayMessage() {
        System.out.println("Message from SuperClass: " + message);
    }
}

class SubClass extends SuperClass {
    private String additionalMessage;

    // Конструктор подкласса, использующий super для вызова конструктора суперкласса
    public SubClass(String message, String additionalMessage) {
        super(message); // Вызов конструктора суперкласса
        this.additionalMessage = additionalMessage;
    }

    // Метод, использующий super для доступа к методу суперкласса
    public void showMessages() {
        super.displayMessage(); // Вызов метода суперкласса
        System.out.println("Additional message from SubClass: " + additionalMessage);
    }

    // Метод, использующий super для доступа к полю суперкласса
    public String getSuperMessage() {
        return super.message; // Доступ к полю суперкласса
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass("Hello from SuperClass!", "Hello from SubClass!");
        subClass.showMessages(); // Вывод обоих сообщений
        System.out.println("Accessing super field: " + subClass.getSuperMessage()); // Доступ к полю суперкласса
    }
}
