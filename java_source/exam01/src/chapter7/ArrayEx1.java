package chapter7;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] nums = new int[4]; // �� �޸� ������ int �ڷ��� 4���� ���� -> �ʱⰪ 0
		for(int j =0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
		
		int[] nums2 = new int[] { 10, 20, 30, 40 }; // 4�� ���� ����, 4�� �� ����
		System.out.println(nums2[0]); // ù��° 4����Ʈ ���� int
		System.out.println(nums2[1]); // �ι�° 4����Ʈ ���� int
		
		int[] nums3 = { 10, 20, 30, 40};
		for(int i = 0; i < nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		
		double[] nums4 = new double[4]; //double ���� 4, �ʱⰪ 0.0
		for(int k=0; k < nums4.length; k++) {
			System.out.println(nums4[k]);
		}
		
		String[] text = new String[4]; // String ���� 4, null���� �ʱ�ȭ
		for(int u=0; u < text.length; u++){
			System.out.println(nums[u]);
		}
		
		int[] nums5 = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i =0; i < nums5.length; i++  ) {
			System.out.println(nums5[i]);
		}
	}
}
