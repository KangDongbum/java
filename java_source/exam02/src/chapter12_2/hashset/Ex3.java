package chapter12_2.hashset;

import java.util.TreeSet;
import java.util.Comparator;

public class Ex3 {
	public static void main(String[] args) {
		Comparator<String> com = new Comparator<>() {
			@Override
			public int compare(String o1, String o2) { 
				return o1.compareTo(o2)*-1;
			}
			
		};
		TreeSet<String>list = new TreeSet<>(com);
		list.add(new String("이름1"));
		list.add(new String("이름3"));
		list.add(new String("이름2"));
		list.add(new String("이름4"));
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
