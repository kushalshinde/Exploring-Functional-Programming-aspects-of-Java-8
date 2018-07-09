import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Name: - Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * 
 * Find Unique Character in a String using Java 8
 *  
 */


public class FirstUniqueCharInAString {

	public static void main(String[] args) {
		String input = "KushalShinde";
		
		System.out.println(printuniqueChar(input));
	}
	

	public static Character printuniqueChar(String input) {
		
		//Java 8
		
		Map<Integer, Long> map = input.chars()
										.boxed()
										.collect(Collectors.groupingBy(Function.identity(), 
																	   LinkedHashMap::new, 
																	   Collectors.counting()));
		
		
		return (char)(int) map.entrySet()
							  .stream()
							  .filter(i -> i.getValue()==1)
							  .findFirst()
							  .map(Map.Entry::getKey)
							  .orElseThrow(() -> new RuntimeException("No Unique Character Present"));
	}

}
