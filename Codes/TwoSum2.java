class Solution {
public static int [] twoSum(int[] nums,int target) {
    int a[] = new int[2];
	HashMap<Integer,Integer> map = new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		int res = target-nums[i];
		if(map.containsKey(res)) {
             a[0]=map.get(res);
             a[1] = i;            
		return a;
		}
		map.put(nums[i],i);
	}
   return a; 
  }
}
