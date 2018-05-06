
/*
 * JAVA 8
 * 
 * Name: - Kushal S Shinde
 * 
 * Check if two strings are anagram of each other
 * 
 * 
 */

import java.util.Arrays;
import java.util.function.IntPredicate;

public class CheckTwoStringsAreAnagramOrNot {

	public static void main(String[] args) {

		String input1 = "mynameiskushal";
		String input2 = "kushalismyname";

		System.out.println(areAnagram(input1, input2) ? "YES" : "NO");

	}

	public static boolean areAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		int[] array1 = new int[256];

		for (int i = 0; i < s1.length(); i++) {
			array1[s1.charAt(i)]++;
			array1[s2.charAt(i)]--;
		}

		IntPredicate predicate = e -> e != 0;

		return Arrays.stream(array1)
				     .noneMatch(predicate);

	}

}
