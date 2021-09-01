package chapter7;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] nums = new int[] {10,20,30,40};
		
		int[] nums2 = {10,20,30,40};
		
		int[] nums3;
		nums3 = new int[] {10, 20, 30, 40};
		nums3[1] = 22;
		
		for(int i=0; i<4;i++) {
			System.out.println(nums[i]);
			System.out.println(nums2[i]);
			System.out.println(nums3[i]);
		}
	}
}
