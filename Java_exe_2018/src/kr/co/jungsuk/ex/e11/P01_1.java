package kr.co.jungsuk.ex.e11;

import java.util.ArrayList;

public class P01_1 {
	/*
		[11-1] ������ �������� 1,2,3,4�� 3,4,5,6�� ������, ������, �������� ���ϴ� �ڵ���
		��. �ڵ带 �ϼ��Ͽ� �������� ���� ����� ����Ͻÿ�.
		[Hint] ArrayListŬ������ addAll(), removeAll(), retainAll()�� ����϶�.
	*/
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // ������
		ArrayList cha = new ArrayList(); // ������
		ArrayList hap = new ArrayList(); // ������
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		for (int i=0; i<list1.size() ; i++) {
			if ( list2.contains( list1.get(i) ) ) {
				kyo.add( list1.get(i) );
			}
		}

		for (int i=0; i<list1.size() ; i++) {
			if ( !list2.contains( list1.get(i) ) ) {
				cha.add( list1.get(i) );
			}
		}
		
		hap.addAll(list1);
		for (int i=0; i<list2.size() ; i++) {
			
			if ( !hap.contains( list2.get(i) ) ) {
				hap.add( list2.get(i) );
			}
		}
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}

}