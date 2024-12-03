public class VarargsOverloading {

    // Метод для обработки переменного числа целых чисел
    public void process(int... numbers) {
        System.out.println("Processing integers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для обработки переменного числа строк
    public void process(String... strings) {
        System.out.println("Processing strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Метод для обработки одного числа и переменного числа строк
    public void process(int number, String... strings) {
        System.out.println("Processing number and strings:");
        System.out.println("Number: " + number);
        System.out.print("Strings: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarargsOverloading example = new VarargsOverloading();

        // Вызов первого метода
        example.process(1, 2, 3, 4);

        // Вызов второго метода
        example.process("apple", "banana", "cherry");

        // Вызов третьего метода
        example.process(10, "one", "two", "three");
    }
}
