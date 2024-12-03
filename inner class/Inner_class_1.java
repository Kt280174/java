class OuterClass {

    // 1. Внутренний класс с модификатором доступа private
    private class PrivateInner {
        void display() {
            System.out.println("Private inner class");
        }
    }

    // 2. Внутренний класс с модификатором доступа default (package-private)
    class DefaultInner {
        void display() {
            System.out.println("Default (package-private) inner class");
        }
    }

    // 3. Внутренний класс с модификатором доступа protected
    protected class ProtectedInner {
        void display() {
            System.out.println("Protected inner class");
        }
    }

    // 4. Внутренний класс с модификатором доступа public
    public class PublicInner {
        void display() {
            System.out.println("Public inner class");
        }
    }

    // Метод для доступа к private классу из OuterClass
    public void accessPrivateInner() {
        PrivateInner privateInner = new PrivateInner();
        privateInner.display(); // Вызов private класса через внешний класс
    }
}

public class Main{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // 1. Доступ к PrivateInner (невозможно, вызовет ошибку компиляции)
        // OuterClass.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка!

        // Но доступ возможен через метод внешнего класса
        outer.accessPrivateInner(); // Вывод: Private inner class

        // 2. Доступ к DefaultInner (только внутри одного пакета)
        OuterClass.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.display(); // Вывод: Default (package-private) inner class

        // 3. Доступ к ProtectedInner
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.display(); // Вывод: Protected inner class

        // 4. Доступ к PublicInner
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.display(); // Вывод: Public inner class
    }
}
