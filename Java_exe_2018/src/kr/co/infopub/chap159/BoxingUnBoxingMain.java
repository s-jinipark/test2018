package kr.co.infopub.chap159;
import java.util.*;
public class BoxingUnBoxingMain {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(5,5);
		v.add(1);//boxing //Java5
		v.add(5);    
		v.add(4);
		v.add(8);    
		v.add(3);
		prints(v);
	}
	public static void prints(Vector<Integer> vi){
		int num=vi.size();
		int sum=0;
		for(int j=0;j<num;j++){
		  sum+=vi.get(j);
	   }//for
	   System.out.println("��   : "+sum);
	}//prints
	
	// Java 5 ���� ����ϴ� ���
	// �ڹ� �÷��� �����ӿ�ũ(JCF) ���� �� <> (angle brackets, ���� ��ȣ) �� �̿�
	// "Vector<Integer>" -> �Ķ����ȭ�� Vector �� ��
	// "<Integer>" -> �Ķ����ȭ�� Ÿ�� , ���� ��ȣ �ȿ��� ������ Ÿ�����θ� ������ϵ��� ����
	
	// ���� ��ȣ �ȿ� ���� �ִ� Ÿ�Կ� ���� ���� ������ ��Ʋ�� 
	// ���׸���(Generics, �Ķ����ȭ�� Ÿ���� ��Ī) ��� �Ѵ�
}
