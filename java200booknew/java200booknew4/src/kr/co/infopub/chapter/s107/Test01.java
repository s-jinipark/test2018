package kr.co.infopub.chapter.s107;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ����
		int [] arr = {21, 4, 19, 31, 16};
		Arrays.sort(arr);
		for (int i=0; i<arr.length ; i++) {
			System.out.println(">" + arr[i]);
		}
		
		System.out.println("---------------");
		int [] arr2 = {21, 4, 19, 31, 16};
		Arrays.sort(arr2, 1, arr2.length);
		for (int i=0; i<arr2.length ; i++) {
			System.out.println(">" + arr2[i]);
		} //-> ù��° 21 ���� �ǵ帮�� �ʰ� 
		// index ���� 1�� �ι�° ������ ������ �� ������ ������ ��Ŵ
		//=> �ٵ� �� ���� �ִ��� ...
		
		System.out.println("---------------");
		//int [] arr3 = {4, 2, 1, 5, 3};
		//Arrays.sort(arr3, Collections.reverseOrder());
		//-> ������
		Integer [] arr3 = {4, 2, 1, 5, 3};
		Arrays.sort(arr3, Collections.reverseOrder());	
		for (int i=0; i<arr3.length ; i++) {
			System.out.println(">" + arr3[i]);
		}
		
		System.out.println("---------------");

		Integer [] arr4 = {4, 2, 1, 5, 3};
		Arrays.sort(arr4, Comparator.reverseOrder()); // �̰͵� ��
		for (int i=0; i<arr4.length ; i++) {
			System.out.println(">" + arr4[i]);
		}
	}

}
