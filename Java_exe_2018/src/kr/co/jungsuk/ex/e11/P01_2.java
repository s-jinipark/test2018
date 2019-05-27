package kr.co.jungsuk.ex.e11;

import java.util.ArrayList;

public class P01_2 {
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
		kyo.addAll(list1); // list1�� ��� ��Ҹ� kyo�� �����Ѵ�.
		kyo.retainAll(list2); // list2�� kyo�� �����Ҹ� ����� �����Ѵ�.
		cha.addAll(list1);
		cha.removeAll(list2); // cha���� list2�� ����� ��ҵ��� ��� �����Ѵ�.
		hap.addAll(list1); // list1�� ��� ��Ҹ� hap�� �����Ѵ�.
		hap.removeAll(kyo); // hap���� kyo�� ����� ��� ��Ҹ� �����Ѵ�.
		hap.addAll(list2); // list2�� ��� ��Ҹ� hap�� �����Ѵ�.
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}

}