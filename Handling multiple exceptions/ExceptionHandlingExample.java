// Определяем два пользовательских исключения
class CustomExceptionA extends Exception {
    public CustomExceptionA(String message) {
        super(message);
    }
}

class CustomExceptionB extends Exception {
    public CustomExceptionB(String message) {
        super(message);
    }
}
// Определяем иерархию исключений
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация исключений для демонстрации
            generateException(1); // Генерирует CustomExceptionA
            generateException(2); // Генерирует CustomExceptionB
        } catch (CustomExceptionA | CustomExceptionB e) {
            // Обработка всех исключений идентичным образом
            System.out.println("Обработано исключение: " + e.getMessage());
        }
        try {
            // Генерация исключений для демонстрации
            generateException_1(1); // Генерирует Ex1
            generateException_1(2); // Генерирует Ex2
            generateException_1(3); // Генерирует Ex3
        } catch (Ex1 e) {
            // Обработка всех исключений идентичным образом
            System.out.println("Обработано исключение: " + e.getMessage());
        }
    }
    
    // Метод для генерации исключений
    private static void generateException(int type) throws CustomExceptionA, CustomExceptionB {
        if (type == 1) {
            throw new CustomExceptionA("Это исключение CustomExceptionA");
        } else if (type == 2) {
            throw new CustomExceptionB("Это исключение CustomExceptionB");
        }
    }
    
    private static void generateException_1(int type) throws Ex1 {
        if (type == 1) {
            throw new Ex1("Это исключение Ex1");
        } else if (type == 2) {
            throw new Ex2("Это исключение Ex2");
        } else if (type == 3) {
            throw new Ex3("Это исключение Ex3");
        }
    }
}