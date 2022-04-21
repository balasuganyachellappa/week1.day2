package week1.day2;

import org.apache.hc.core5.util.Args;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int temp = 0;
		System.out.println("array length=" + arr.length);
		System.out.println("-------------sorting of array in  ascending--------------");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				} else
					break;
			}
			System.out.println("array after sorting" + arr[i]);

		}

		for (int i = arr[0]; i < arr.length; i++)

		{
			if ((i) != arr[i - 1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
