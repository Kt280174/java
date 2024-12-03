class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main
{
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(123);

        if (stringBox instanceof Box) {
        System.out.println("stringBox является экземпляром Box");
        if (intBox instanceof Box){
            System.out.println("intBox является экземпляром Box");
        }
}

	}
}