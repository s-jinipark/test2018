package kr.co.infopub.chap017;
public class If3hangTest{

	public static void main(String[] args) {
		
		int year=2004;

		String sEven= ( (year%2==0) ? "¦�� ��" : "Ȧ����" );
		System.out.printf("%d�� %s�Դϴ�. %n",
			     year,( (year%2==0) ? "¦�� ��" : "Ȧ����" ));
		System.out.printf("%d�� %s�Դϴ�. %n",year,sEven);
		/*
		System.out.println(year+"�� "+sEven+"�Դϴ�.");
		System.out.println(year+"�� "+
			( (year%2==0) ? "¦�� ��" : "Ȧ����" )+"�Դϴ�.");
		*/

	}
}
