package chapter7;

public class ArrayEx4 {
	public static void main (String[] args) {
		int[] nums = new int[]{10,20,30,40};
		int[] nums2 = new int[7];
		
		/*
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		} */
		
		System.arraycopy(nums, 0, nums2, 0, 4);
		nums2[1]=22;
		System.out.println("---------nums2--------");
		for(int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		System.out.println("--------nums-------");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
