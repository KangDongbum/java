package chapter12_3.treeSet;

import java.util.TreeSet;

public class TresSetEx1 {
	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<>();
		list.add(new String("�̸�1"));
		list.add(new String("�̸�2"));
		list.add(new String("�̸�3"));
		list.add(new String("�̸�4"));
		
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}
