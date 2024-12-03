class OuterClass {
    private String privateField = "Private Field";
    String defaultField = "Default Field";
    protected String protectedField = "Protected Field";
    public String publicField = "Public Field";

    // Метод внешнего класса
    private void privateMethod() {
        System.out.println("Private Method in OuterClass");
    }

    // Вложенный класс
    class InnerClass {
        void displayFields() {
            // Доступ ко всем полям внешнего класса
            System.out.println("Accessing OuterClass fields:");
            System.out.println("Private Field: " + privateField);
            System.out.println("Default Field: " + defaultField);
            System.out.println("Protected Field: " + protectedField);
            System.out.println("Public Field: " + publicField);

            // Доступ к методам внешнего класса
            System.out.println("\nCalling OuterClass methods:");
            privateMethod();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта внешнего класса
        OuterClass outer = new OuterClass();

        // Создание объекта внутреннего класса
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Вызов метода внутреннего класса
        inner.displayFields();
    }
}
