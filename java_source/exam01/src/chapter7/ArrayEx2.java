package chapter7;

public class ArrayEx2 {
	public static void main(String[] args) {
		//배열의 갯수 -> 요소의 개수 X, 공간의 갯수
		double[] nums = new double[5]; //double 공간 5개
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
