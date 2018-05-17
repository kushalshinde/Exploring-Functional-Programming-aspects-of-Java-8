/*
 * Name: - Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * 
 * Find top k frequent words from a stream of text coming from a document using HashMap and a PriorityQueue
 * 
 * Here I used k = 5, (top 5 frequently occured words)
 * 
 */

import java.util.*;


class WordFreq implements Comparable<WordFreq> {
    String word;
    int freq;

    public WordFreq(final String w, final int c) {
        word = w;
        freq = c;
    }

    @Override
    public int compareTo(final WordFreq other) {
        return Integer.compare(this.freq, other.freq);
    }

	@Override
	public String toString() {
		return word + "->" + freq;
	}
    
    
}

public class TopKmostFrequentWords {
	
	public static void main(String[] args) {
		String input = "Welcome to the world of Geeks \r\n" + 
				"This portal has been created to provide well written well thought and well explained \r\n" + 
				"solutions for selected questions If you like Geeks for Geeks and would like to contribute \r\n" + 
				"here is your chance You can write article and mail your article to contribute at \r\n" + 
				"geeksforgeeks org See your article appearing on the Geeks for Geeks main page and help \r\n" + 
				"thousands of other Geeks";
		
		Scanner sc = new Scanner(input);      //Used Scanner to get rid of a String array
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(sc.hasNext()) {
			String stringAdd = sc.next();
			map.put(stringAdd, map.getOrDefault(stringAdd, 0) + 1);
		}
		
		//System.out.println(map);
			
		PriorityQueue<WordFreq> pq = new PriorityQueue<WordFreq>(5, (x,y) -> x.freq - y.freq);
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			pq.add(new WordFreq(e.getKey(), e.getValue()));

			if(pq.size() > 5) {
				pq.poll();
			}
		}
		
		System.out.println(pq);
		
		sc.close();
	}	
}
