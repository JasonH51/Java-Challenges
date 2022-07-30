package ArrayChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Integer[] myInts = getIntArray(5);

//		Arrays.sort(myInts, Collections.reverseOrder());
		
		Integer[] sortedInts = sortIntegers(myInts);

		for (Integer num : sortedInts) {
			System.out.println("my integers in reverse order " + num);
		}

	}

	public static Integer[] getIntArray(int num) {
		Integer[] newArray = new Integer[num];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = scanner.nextInt();
			System.out.println("new input in arry at position " + i);
		}
		return newArray;
	}

	public static Integer[] sortIntegers(Integer[] array) {
		Integer[] sortedArray = new Integer[array.length];

		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;

			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
			
		}
		return sortedArray;
	}
}
