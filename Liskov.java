
//Предположим, у нас есть базовый класс `Bird` и два подкласса: `Sparrow` (воробей) и `Penguin` (пингвин). 
//В этом примере мы сначала нарушим принцип Лисков, а затем исправим его.

// Нарушение принципа Лисков:

class Bird {
    public String fly() {
        return "I can fly!";
    }
}

class Sparrow extends Bird {
    // Воробей может летать, его поведение наследуется из Bird
}
class Penguin extends Bird {
    @Override
    public String fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

public class Main {
    public static void letBirdFly(Bird bird) {
        System.out.println(bird.fly());
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        letBirdFly(sparrow); // Вывод: I can fly!

        Bird penguin = new Penguin();
        letBirdFly(penguin); // Вывод: UnsupportedOperationException
    }
}

//В этом примере программа выдает ошибку при попытке вызвать метод `fly()` для объекта класса `Penguin`,
//который не может летать, что нарушает принцип подстановки Лисков.

// Исправление принципа Лисков:

//Чтобы соблюдать принцип Лисков, мы можем создать интерфейс `FlyingBird`:
interface FlyingBird {
    String fly();
}

class Bird {
    // Общие свойства и методы для всех птиц
}

class Sparrow extends Bird implements FlyingBird {
    @Override
    public String fly() {
        return "I can fly!";
    }
}

class Penguin extends Bird {
    // Пингвин остается без метода fly
}

public class Main {
    public static void letBirdFly(FlyingBird bird) {
        System.out.println(bird.fly());
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        letBirdFly(sparrow); // Вывод: I can fly!

        // Penguin не реализует интерфейс FlyingBird, так что мы не можем передать его в letBirdFly
        Penguin penguin = new Penguin();
        // letBirdFly(penguin); // Это вызовет ошибку компиляции, что является желаемым поведением
    }
}