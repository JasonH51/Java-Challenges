package ReversedArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println("Enter 5 numbers");
		array = inputs();

		reverseArray(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println("reversed array! position " + i + " is now equal to " + array[i]);
		}
	}

	public static int[] inputs() {
		Scanner scanner = new Scanner(System.in);
		int[] newArr = new int[5];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();

		return newArr;
	}

	public static void reverseArray(int[] arr) {

		for (int i = 0; i < Math.floor(arr.length / 2); i++) {
			arr[i] = arr[i] + arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = arr[i] - arr[(arr.length - 1) - i];
			arr[i] = arr[i] - arr[(arr.length - 1) - i];
		}
	}

}
