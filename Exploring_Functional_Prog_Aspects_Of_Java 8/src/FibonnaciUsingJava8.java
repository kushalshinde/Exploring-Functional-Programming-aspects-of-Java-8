import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * JAVA 8
 * 
 * Name: - Kushal S Shinde
 * 
 * Fibonnaci Using Java 8 Streams 
 * 
 * 
 */

public class FibonnaciUsingJava8 {

	public static void main(String[] args) {

		fibonacci(15);

	}
	
	
	public static void fibonacci(int number) {
		
		List<Integer> list = Stream.iterate(new int[] {0, 1}, i -> new int[] {i[1], i[0] + i[1]})
								   .limit(number)
		                           .map(i -> i[0])
		                           .collect(Collectors.toList());
		
		
		System.out.println(list);
	}

}
