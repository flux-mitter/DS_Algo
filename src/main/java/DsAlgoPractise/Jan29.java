package DsAlgoPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 1, 3, 5, 2 ,6,1};
		answer2(3, a);

	}

	/**
	 * Question 1 We are working on a new online game, and as part of the game, we
	 * are writing a script editor. We would like to implement some basic
	 * auto-complete functionality. As a starting step, we would like to determine
	 * how many functions match a given search string.
	 * 
	 * A function matches the given search string if all of the characters in the
	 * search string appear in order (but not necessarily consecutively) in the
	 * function. For example, consider the function "replacefirst" and the following
	 * search strings:
	 * 
	 * replacefirst Search String: ^^^ "rep" matches ^ ^ "rf" matches ^ ^ "fr"
	 * matches "fre" does NOT match. There is an f and r in order, but no e after
	 * them
	 * 
	 * Write a function that takes in a list of strings representing function names,
	 * and a search string, and returns how many strings in the list match the
	 * search string.
	 * 
	 * All Test Cases: autocomplete(functions, "li") => 6 autocomplete(functions,
	 * "rep") => 3 autocomplete(functions, "cize") => 1 autocomplete(functions,
	 * "ssh") => 1 autocomplete(functions, "sp") => 3 autocomplete(functions, "fre")
	 * => 0
	 * 
	 * Complexity Variables: n: The number of functions
	 */

	/*
	 * Question 2: Program to count the number of elements which are greater than
	 * any of the elements on the right side of an array and if it does s lesser it
	 * should be replaced by -1
	 */

	public static void Answer1() {

	}

	public static void answer2(int search, Integer arr[]) {
		// int outpu[] = new int[arr.length];
		int count = 0;
		if (Arrays.asList(arr).contains(search)) {
			for (int i = 0; i < arr.length; i++) {
				// i
				int temp = 0;
				if (arr[i] == search) {
					temp = i;
				}
				if (i > temp) {
					if (arr[i] > search) {
						count = count + 1;
					} else {
						arr[i] = -1;
					}
				}
			}
		} else {
			System.out.println("Element not in the array");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println("Count =" + count);
	}

}