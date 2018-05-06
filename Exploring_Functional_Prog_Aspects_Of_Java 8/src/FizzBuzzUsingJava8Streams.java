import java.util.stream.IntStream;

/*
 * JAVA 8
 * 
 * Name: - Kushal S Shinde
 * 
 * FizzBuzz Using Java 8 Streams 
 * 
 * 
 */

public class FizzBuzzUsingJava8Streams {

	public static void main(String[] args) {
	
		IntStream.rangeClosed(0, 100).mapToObj(
		        i -> i % 3 == 0 ?
		                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
		                (i % 5 == 0 ? "Buzz" : i))
	    	        .forEach(System.out::println);

		
	}
}
