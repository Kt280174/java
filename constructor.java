


class Animal {
    public void voice() {
        System.out.println("Говори!");
    }
}

class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        
        myCat.voice();  // Output: Мяу!
        myDog.voice();  // Output: Гав!
    }
}
