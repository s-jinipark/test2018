package kr.co.infopub.chap156.test100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++ ) {
			list.add((int)(Math.random()*100+1));
			// 1���� 100������ ������ 10���� �������� �Է�
		}
		
		System.out.println("������: "); 
		for(Object o : list){ 
			Integer i = (Integer)o; 
			System.out.print(i + " "); 
		}
		
		System.out.println("\r\n");
		System.out.println("�������� ����: "); 

		Collections.sort(list); //Collictions.sort �޼ҵ带 �̿��� �������� ����
		
		for(Object o : list){ 
			Integer i = (Integer)o; 
			System.out.print(i + " "); 
		}
		
		Collections.sort(list,new Comp());

		System.out.println("\r\n");

		System.out.println("�������� ����: ");
		for(Object o : list){ 
			Integer i = (Integer)o; 
			System.out.print(i + " "); 
		} 
	}

}
