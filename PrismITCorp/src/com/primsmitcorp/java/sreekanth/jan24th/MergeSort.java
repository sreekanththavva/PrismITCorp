/**
 * 
 */
package com.primsmitcorp.java.sreekanth.jan24th;

import java.lang.reflect.Array;

/**
 * @author sreekanthreddy
 *
 */
class MergeSort {

	void merge(int arr[], int left, int middle, int right) {
		// Find sizes of two sub-arrays to be merged
		int n1 = middle - left + 1;
		int n2 = right - middle;

		/* Create temp arrays */
		int Left[] = new int[n1];
		int Right[] = new int[n2];

		/* Copy data to temp arrays */
		for (int check = 0; check < n1; ++check)
			Left[check] = arr[left + check];
		for (int check1 = 0; check1 < n2; ++check1)
			Right[check1] = arr[middle + 1 + check1];

		/* Merge the temp arrays */

		// Initial indexes of first and second sub-arrays
		int check = 0, check1 = 0;

		// Initial index of merged sub-array array
		int check3 = left;
		while (check < n1 && check1 < n2) {
			if (Left[check] <= Right[check1]) {
				arr[check3] = Left[check];
				check++;
			} else {
				arr[check3] = Right[check1];
				check1++;
			}
			check3++;
		}

		/* Copy remaining elements of L[] if any */
		while (check < n1) {
			arr[check3] = Left[check];
			check++;
			check3++;
		}

		/* Copy remaining elements of right if any */
		while (check1 < n2) {
			arr[check3] = Right[check1];
			check1++;
			check3++;
		}
	}

	// Main function that sorts array using
	// merge()
	void sort(int arr[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int middle = (left + right) / 2;

			// Sort first and second halves
			sort(arr, left, middle);
			sort(arr, middle + 1, right);

			// Merge the sorted halves
			merge(arr, left, middle, right);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);
		System.out.println("Array of lemgth :"+arr.length);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}