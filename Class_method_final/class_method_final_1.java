class SuperClass {
    // Объявляем метод как final
    public final void display() {
        System.out.println("This is a final method in the SuperClass.");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    /*
    public void display() {
        System.out.println("Trying to override the final method.");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.display(); // Вывод: This is a final method in the SuperClass.

        SubClass subClass = new SubClass();
        subClass.display(); // Вывод: This is a final method in the SuperClass.
    }
}
