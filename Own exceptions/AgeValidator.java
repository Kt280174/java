// Определение собственного класса исключения
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    // Метод для проверки возраста
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }
    }

    public static void main(String[] args) {
        int[] ages = {25, -1, 200, 30};

        for (int age : ages) {
            try {
                validateAge(age);
                System.out.println("Valid age: " + age);
            } catch (InvalidAgeException e) {
                System.out.println("Invalid age: " + e.getMessage());
            }
        }
    }
}