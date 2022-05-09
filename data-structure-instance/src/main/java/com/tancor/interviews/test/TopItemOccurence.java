package com.tancor.interviews.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * 
 * @author amitt
 *
 */
public class TopItemOccurence {

	public static void main(String[] args) {

		int arr[]= {1,1,1,1,1,1,1,1,2,2,3,4,4,4,4,4,4,7,8,9,9,7,8,9,9};

		List<Integer> topK=getTopOccurence(arr, 2, 5);
		System.out.println(topK);

	}

	private static List<Integer> getTopOccurence(int[] arr, int k, int topRecord) {

		PriorityQueue<Entry<Integer, Integer>> queue=new PriorityQueue<>(Comparator.comparing(Entry::getValue, 
				Comparator.reverseOrder()));

		Map<Integer, Integer> occurenceMap = Arrays.stream(arr).mapToObj( x -> x)
				.collect(Collectors.toMap(x -> x, x -> 1, (x1,x2) -> x1+x2));

		System.out.println(occurenceMap);

		occurenceMap.entrySet().stream().forEach(e -> {
			queue.add(e);			
		});

		List<Integer> topRecordList = queue.stream().limit(topRecord).map(e -> e.getKey())
				.collect(Collectors.toList());
		if(!topRecordList.isEmpty()) {
			return topRecordList;
		}
		
		return null;
	}
}
