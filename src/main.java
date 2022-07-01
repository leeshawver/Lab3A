import java.lang.reflect.Array;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 5, 2, 8, 13, 6};
		System.out.println(myArray[0]);
		System.out.println(myArray[myArray.length - 1]);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		for (int element: myArray) {
			System.out.println(element);
		}
		double sum = 0;
		for (int n = 0; n < myArray.length; n++) {
			sum += myArray[n];
		}
		System.out.println(sum);
		double average = sum / myArray.length;
		System.out.println(average);
		for (int digit: myArray) {
			if (digit % 2 == 1) {
				System.out.println(digit);
			}
		}
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		sum = 0;
		for (String name: names) {
			sum += name.length();
		}
		System.out.println(sum);
	}

}
