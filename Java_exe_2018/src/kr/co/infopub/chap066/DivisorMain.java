package kr.co.infopub.chap066;
public class DivisorMain
{
	public static void main(String[] args) 
	{
		System.out.println("5�� 10�� ���? "+Divisor.isMod(10,5));
		System.out.println("5�� 13�� ���? "+Divisor.isMod(13,5));
		Divisor.printDivisor(15); //15�� ��� ��� 1 ����
	}
}
