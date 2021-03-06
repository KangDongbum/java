package chapter13_3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Ex3 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
		
		 int total = Arrays.stream(nums).reduce(0,(a,v) -> a + v);
		 //System.out.println(total);
		 
		 String[] texts = {"ABCD","AB","A","B","C","ABC"};
		 String longText = Arrays.stream(texts).reduce("",(a,v)->a.length() >= v.length()?a:v);
		 //System.out.println(long Text);
		 
		BinaryOperator<String>bi = new BinaryOperator<>() {
			public String apply(String t, String u) {
				return t.length() >= u.length()?t:u;	
			}
		};
		
		String longText2 = Arrays.stream(texts).reduce(texts[0], bi); //초기값이 있으면 reduce는 최종연산
		//System.out.println(longText2);
		
		String longText3 = Arrays.stream(texts).reduce(bi).get(); //초기값이 없으면 reduce -> 중간 연산
		System.out.println(longText3);
		
	}
}
