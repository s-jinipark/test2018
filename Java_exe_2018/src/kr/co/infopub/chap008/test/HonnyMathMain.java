package kr.co.infopub.chap008.test;
import static kr.co.infopub.chap008.HonnyMath.*;
import static java.lang.Math.*;
//static imports ���� 
//�������� ����߸���. 
public class HonnyMathMain 
{
	public static void main(String[] args) 
	{
		double c=sum(2.4,4.5);//HonnyMath.sum()
		double e=sqrt(2.4);  //Math.sqrt()
		double d=c*c*PIE;    //HonnyMath.PIE
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
