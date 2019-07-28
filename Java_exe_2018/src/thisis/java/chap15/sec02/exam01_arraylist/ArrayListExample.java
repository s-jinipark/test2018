package thisis.java.chap15.sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // 0
		list.add("JDBC"); // 1
		list.add("Servlet/JSP"); // 2
		list.add(2, "Database"); // 2 �ڸ��� ����
		list.add("iBATIS");
		// [2]
		list.add("iBATIS");
		
		int size = list.size(); // ����� �� ��ü �� ���
		System.out.println("�� ��ü��: " + size);		
		System.out.println();
		
		String skill = list.get(2); // 2�� �ε��� ��ü ���
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		list.remove(2); // 2�� ���� (Database)
		list.remove(2); // ������� ���� 2�� �� (Servlet/JSP) ���� 
		                // ***** (����)
		
		list.remove("iBATIS"); // [2] �ߺ� ���� ���� ��� �ϳ��� remove
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}

