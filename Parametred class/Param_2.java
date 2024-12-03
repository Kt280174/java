import java.util.ArrayList; 
import java.util.List;  
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class WildcardsExample {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(); // Доступны методы класса Shape
        }
        // shapes.add(new Circle()); // Ошибка компиляции — нельзя добавлять элементы
    }
    public static void addNumbers(List<? super Integer> list) {
        list.add(42); // Можно добавлять Integer или его подтипы
        // list.add(new Number()); // Ошибка компиляции — нельзя добавлять родительский тип
    }
    public static void main(String[] args) {
        List<Circle> circles = List.of(new Circle());
        List<Rectangle> rectangles = List.of(new Rectangle());

        drawShapes(circles);
        drawShapes(rectangles);
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addNumbers(numbers);
        addNumbers(objects);

        System.out.println(numbers); // [42]
        System.out.println(objects); // [42]
    }
}