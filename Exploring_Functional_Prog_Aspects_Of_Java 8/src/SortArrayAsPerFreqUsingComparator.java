import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Name: - Kushal S Shinde
 * 
 * Let's consider an array elements [3,3,3,2,2,4,1,9,9,3,2]
 * Output should be sort an array as per it's frequency in descending order Using Java 8
 * 
 * Input array : - [3,3,3,2,2,4,1,9,9,3,2]
 * output array: - [3,3,3,3,2,2,2,9,9,4,1]
 * 
 * 
 */

public class SortArrayAsPerFreqUsingComparator {

	public static void main(String[] args) {
		int[] array = {3,3,3,2,2,4,1,9,9,3,2};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : array) {
			map.put(i, map.getOrDefault(i,0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> l1 = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			l1.add(e);
		}
		
		
		/*Collections.sort(l1, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().intValue() - o1.getValue().intValue();
			}
		});*/
		
		Collections.sort(l1, (a, b) -> b.getValue().intValue() - a.getValue().intValue());
			
		for(Map.Entry<Integer, Integer> e : l1) {
			if(e.getValue()>1) {
				int max = e.getValue();
				while(max>0) {
					System.out.print(e.getKey()+ " ");
					max--;
				}
			}
			else {
				System.out.print(e.getKey() + " ");
			}
		}

	}

}
