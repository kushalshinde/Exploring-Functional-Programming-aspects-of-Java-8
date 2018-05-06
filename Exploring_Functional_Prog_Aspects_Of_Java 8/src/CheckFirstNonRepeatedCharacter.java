import java.util.Map;
import java.util.stream.Collectors;

/*
 * JAVA 8
 * 
 * Name: - Kushal S Shinde
 * 
 * Check first non repeated character from a String 
 * 
 * 
 */

public class CheckFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String a = "abbaraSubbara";	    
	    
	    Map<Character, Integer> map = a.chars()
	    		                       .boxed()
	    		                       .collect(Collectors.toMap(
	    		                    		  k -> Character.valueOf((char) k.intValue()),
	    		                    		  v -> 1,
	    		                    		  Integer::sum));
	    
	
	    
		System.out.println(map.entrySet()
				              .stream()
				              .filter(e -> e.getValue()==1)
				              .findFirst()
				              .get()
				              .getKey());

	}

}
