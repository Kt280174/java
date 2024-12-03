
public class Main
{   
    enum Day { MONDAY, TUESDAY, WEDNESDAY }
	public static void main(String[] args) {
    //1. int 
    int number = 2;
    switch (number) {
        case 1:
            System.out.println("Number is 1");
            break;
        case 2:
            System.out.println("Number is 2");
            break;
        default:
            System.out.println("Number is neither 1 nor 2");
    }
    
    //2. char
    char letter = 'A';
    switch (letter) {
        case 'A':
            System.out.println("Letter is A");
            break;
        case 'B':
            System.out.println("Letter is B");
            break;
        default:
            System.out.println("Letter is not A or B");
    }
    
    //3. byte
    byte b = 10;
    switch (b) {
        case 10:
            System.out.println("Byte is 10");
            break;
        default:
            System.out.println("Byte is not 10");
    }
    
    //4.short
    short s = 20;
    switch (s) {
        case 20:
            System.out.println("Short is 20");
            break;
        default:
            System.out.println("Short is not 20");
    }
    
    //5.enum

    Day today = Day.MONDAY;
    switch (today) {
        case MONDAY:
            System.out.println("Today is Monday");
            break;
        case TUESDAY:
            System.out.println("Today is Tuesday");
            break;
    }
    
    //6. string
    String str = "Hello";
    switch (str) {
        case "Hello":
            System.out.println("Greeting is Hello");
            break;
        case "Goodbye":
            System.out.println("Greeting is Goodbye");
            break;
    }
	}
}