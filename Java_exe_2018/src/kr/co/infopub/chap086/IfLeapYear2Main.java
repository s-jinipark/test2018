package kr.co.infopub.chap086;
public class IfLeapYear2Main {

	public static void main(String[] args) {
		IfLeapYear2 leap=new IfLeapYear2();
		leap.setYear(2004);//member �ʵ带 2004�� 
		System.out.println(leap.isLeapYear());
		leap.prints();     //2004�⿡ ���� ���⿩�� 
		
		leap.setYear(2005);//member �ʵ带 2005�� 
		leap.prints();     //2005�⿡ ���� ���⿩�� 
	}
}
