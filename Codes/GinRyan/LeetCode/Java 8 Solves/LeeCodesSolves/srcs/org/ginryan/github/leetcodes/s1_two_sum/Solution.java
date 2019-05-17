package org.ginryan.github.leetcodes.s1_two_sum;

import java.util.ArrayList;

/**
 * 1. ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
 * 
 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
 * 
 * ʾ��:
 * 
 * ���� nums = [2, 7, 11, 15], target = 9
 * 
 * ��Ϊ nums[0] + nums[1] = 2 + 7 = 9 ���Է��� [0, 1]
 * 
 * @author GinRyan
 *
 */
class Solution {

	public int[] twoSum(int[] nums, int target) {
		ArrayList<Integer> cache = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int diff = target - num;
			if (cache.contains(diff)) {
				return new int[] { cache.indexOf(diff), i };
			}
			cache.add(num);
		}
		return nums;
	}

	public static void main(String[] args) {

	}
}