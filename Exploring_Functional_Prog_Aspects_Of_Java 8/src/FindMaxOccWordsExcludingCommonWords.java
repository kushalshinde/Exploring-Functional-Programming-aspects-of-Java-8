/*
 * Name: - Kushal S Shinde
 * 
 * Email: - kshinde1@binghamton.edu
 * 
 * 
 * Interview Question
 * 
 * Java 8
 * 
 * Question: - Find maximum occurred words from a stream of literature text excluding a list of common words
 * 
 * Literature text : - "kushal and tushar went to the store to buy egg and milk milk is kushal favorite food"
 * 
 * Common words to exclude : - ["and", "he", "the", "to", "his"]
 * 
 * Output: - 
 * 
 * [kushal, milk]
 * 
 */




import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaxOccWordsExcludingCommonWords {
	public static void main(String[] args) {
		
		String Sentence = "kushal and tushar went to the store to buy egg and milk milk is kushal favorite food";
		List<String> wordtoexclude = Arrays.asList("and", "he", "the", "to", "his");
		
		System.out.println(find(Sentence, wordtoexclude));
		
	}   
	
	
	public static List<String> find(String literaturtext, List<String> wordtoexclude){
		
		//break the sentence into words and put them into a list
		List<String>output = Arrays.asList(literaturtext.split("\\s+"));
	
		
		//filter excluded words from a stream and collect them in to a map as per their occurrences
		Map<String, Long> map1 = output.stream()
		        					.filter(i -> !wordtoexclude.contains(i))
		        					.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		
		//Find the max occurred element value         		
		long max = map1.values()
					   .stream()
					   .max(Comparator.naturalOrder())
					   .get();
		
		
		//return a list of max occurred words 
		return map1.entrySet()
				   .stream()
				   .filter(e -> e.getValue() == max)
				   .map(Map.Entry::getKey)
				   .collect(Collectors.toList());
	}
}