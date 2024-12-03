// Суперкласс
class Animal {
    // Обычный метод, который не принимает аргументов
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    // Перегруженный метод с одним аргументом
    public void sound(String sound) {
        System.out.println("Animal makes a sound: " + sound);
    }

    // Перегруженный метод с двумя аргументами
    public void sound(String sound, int volume) {
        System.out.println("Animal makes a sound: " + sound + " with volume " + volume);
    }
}

// Подкласс Dog, который переопределяет метод sound
class Dog extends Animal {
    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Переопределение перегруженного метода с одним аргументом
    @Override
    public void sound(String sound) {
        System.out.println("Dog " + sound);
    }

    // Перегруженный метод с двумя аргументами
    @Override
    public void sound(String sound, int volume) {
        System.out.println("Dog " + sound + " with volume " + volume);
    }
}

// Подкласс Cat, который переопределяет метод sound
class Cat extends Animal {
    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    // Переопределение перегруженного метода с одним аргументом
    @Override
    public void sound(String sound) {
        System.out.println("Cat " + sound);
    }

    // Перегруженный метод с двумя аргументами
    @Override
    public void sound(String sound, int volume) {
        System.out.println("Cat " + sound + " with volume " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Вызов методов без аргументов
        myAnimal.sound();  // Выведет: Animal makes a sound
        myDog.sound();     // Выведет: Dog barks
        myCat.sound();     // Выведет: Cat meows

        // Вызов перегруженных методов с аргументами
        myAnimal.sound("roars");       // Выведет: Animal makes a sound: roars
        myDog.sound("barks loudly");   // Выведет: Dog barks loudly
        myCat.sound("meows softly");   // Выведет: Cat meows softly

        // Вызов перегруженных методов с двумя аргументами
        myAnimal.sound("roars", 10);     // Выведет: Animal makes a sound: roars with volume 10
        myDog.sound("barks", 8);         // Выведет: Dog barks with volume 8
        myCat.sound("meows", 5);         // Выведет: Cat meows with volume 5
    }
}
