package kr.co.infopub.chap005;

public class HelloCalendar100 {

	//005 �ڹ� ���α׷����� ���� �⺻ ���� ��� 
	// ����� ������ �ƴ� �ظ� ����
	//���� chk
	public boolean isLeapYear(int year) {
		boolean yearTF=false;
		if( ((year % 4==0) && (year %100 !=0))
				|| year%400==0 ){
			yearTF = true;
		}
		return yearTF;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloCalendar100 h100 = new HelloCalendar100();
		for (int i=2017; i<2030; i++) {
			System.out.println(i + "\t" + h100.isLeapYear(i));
		}
	}

}
/*
����(Notation)
--------------------
�Ľ�Į(Pascal)		Ŭ����, �������̽�, ������
ī��(Camel)			�޼���, ��� �ʵ�, AWT ��� ���� ȭ�� ����
�밡����(Hungarian)	AWT ��� ���� ȭ�� ����
��ü �빮��			���
��ü �ҹ���			��Ű��

�ĺ���
    �Ϲݹ��� : ��� ��
    $, _ : ��� ��
    Ư������ ($, _ ����) : �Ұ�
    ���� : �ι�°���� ����(���ڷ� ������ �� ����)
*/