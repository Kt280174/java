public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    /*Вариант 1:
    public static void main(String[] args) {
        printVars(); 
    }*/
    
    /*Вариант 2:
    public static void main(String[] args) {
        A instance = new A();
        instance.printVars();
    }*/
    //Вариант 3:
    public static void main(String[] args) {
        A.printVars(); 
    }
}
