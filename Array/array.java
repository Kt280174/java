
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int intArr[] = {10, 20, 15, 22, 35};
		System.out.println("Integer Arrays: " + Arrays.toString(intArr));
		char vowels[] = {'a', 'e', 'i', 'o', 'u'};
		char key = 'i';
		System.out.println("The given vowel is at index: "+ Arrays.binarySearch(vowels, key));
		String[] cars = {"Volvo", "BMW", "Tesla"};
		String[] cars2 = {"Volvo", "BMW", "Tesla"};
		System.out.println(Arrays.equals(cars, cars2));
		System.out.println(Arrays.compare(cars, cars2));
		Arrays.sort(intArr);
		for (int num: intArr){
		    System.out.print(num+" ");
		}
	}
}