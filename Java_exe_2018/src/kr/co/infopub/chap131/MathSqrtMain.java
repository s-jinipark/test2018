package kr.co.infopub.chap131;
public class MathSqrtMain {

	public static void main(String[] args) {
		MathSqrt ms=new MathSqrt(100,0);
		System.out.println("SQRT(100) :"+ms.fuctValue());
		
		ms.setA(3.0);    //���ϰ��� �ϴ� Root�� SQRT(3) ���� 3������
		ms.setXMin(2);   //������
	    System.out.println("SQRT(3) :"+ms.fuctValue());
	    
		ms.setA(11.0);    //���ϰ��� �ϴ� Root�� SQRT(11) ���� 11������
		ms.setXMin(2);   //������
		System.out.println("SQRT(11) :"+ms.fuctValue());
		ms.setA(3.0);    //���ϰ��� �ϴ� Root�� SQRT(3) ���� 3������
		ms.setXMin(-1);   //������
		System.out.println("SQRT(3) :"+ms.fuctValue());
		System.out.println("SQRT(3) :"+ms.fuctValue());
		ms.setA(8.0);    //���ϰ��� �ϴ� Root�� SQRT(8) ���� 8������
		ms.setXMin(2);   //������
		System.out.println("SQRT(8) :"+ms.fuctValue());
		System.out.println("SQRT(8) :"+Math.sqrt(8));
		System.out.println("���� ���� ���� :"+(Math.sqrt(8)-ms.fuctValue()));
	}
}
