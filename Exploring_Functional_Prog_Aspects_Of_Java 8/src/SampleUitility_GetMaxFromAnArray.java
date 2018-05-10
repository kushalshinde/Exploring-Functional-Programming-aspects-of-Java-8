import java.util.Arrays;

/*
 * Name: - Kushal S Shinde
 * 
 * Email: - kshinde1@binghamton.edu
 * 
 * Java 8
 * 
 * Find maximum and minimum value from an array elements using Java 8
 * 
 * 
 * 
 */

public class SampleUitility_GetMaxFromAnArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {6,8,6,4,2,4,5,6,7,4,2};
		
		int min = Arrays.stream(array)
						.min()
						.getAsInt();

		
		System.out.println(min);
		
		int max = Arrays.stream(array)
						.max()
						.getAsInt();
		
		
		System.out.println(max);
	}

}
