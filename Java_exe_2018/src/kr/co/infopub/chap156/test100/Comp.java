package kr.co.infopub.chap156.test100;

import java.util.Comparator;

public class Comp implements Comparator<Integer> {
	// Comparator �������̽��� ����
	public int compare(Integer o1, Integer o2){ //compara �޼ҵ带 �������̵� 
		/*-- ��������
		if(o1>o2) return -1;
		else if(o1<o2)return 1;
		else return 0;
		*/
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1); //���� if ���� ���ǻ��� �����ڷ� ��ü
	}
	/* equals�� �������� ������ Object�� equals�� ����մϴ�. 
	equals�� ���������� �����ս��� ���ȴٴ� ���� �ֽ��ϴ�. */
}
