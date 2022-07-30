package MinElementChallenge;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("set the count: ");
		int count = scanner.nextInt();
		System.out.println("set the numbers in the array");
		int[] intArray = readIntegers(count);

		System.out.println("min value = " + findMin(intArray));

	}

	public static int[] readIntegers(int count) {
		int[] myInts = new int[count];

		for (int i = 0; i < myInts.length; i++) {
			myInts[i] = scanner.nextInt();
		}

		return myInts;
	}

	public static int findMin(int[] array) {
		int[] intArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			intArray[i] = array[i];
		}

		int temp = intArray[0];

		for (int i = 1; i < intArray.length; i++) {

			if (temp > intArray[i]) {
				temp = intArray[i];
			}
		}

		return temp;
	}

}
