package com.tancor.interviews.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 * 
 * 
 * @author amitt
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] twoSum = twoSum(new int[] {2,7,11,15}, 9);
		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}

		twoSum = twoSum(new int[] {1,-2,-3,-4,-5}, -8);
		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map=new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				return new int[] {i, map.get(nums[i])}; 
			}
			map.put(target-nums[i], i);
		}
		return null;
	}
	
}
