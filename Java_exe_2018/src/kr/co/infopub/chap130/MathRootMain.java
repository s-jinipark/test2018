package kr.co.infopub.chap130;
public class MathRootMain {

	public static void main(String[] args) {

		double [] m={1,-1,0,-1};
		//^�� ��(�¼�)�� ����.
		//f(x)=1*x^3-1*x^2+0*x^1-1 
		MathRoot mr=new MathRoot(2/3.0,2.0,m);

		System.out.println("f(x)�� �� :"+mr.fuctValue());
		System.out.println("===================================");
		double [] m2={1,0,-1,-1};
		//^�� ��(�¼�)�� ����.
		//f(x)=1*x^3+0*x^2-1*x^1-1 
		MathRoot mr2=new MathRoot(0,2.0,m2);
		System.out.println("f(x)�� �� :"+mr2.fuctValue());
		System.out.println("f(1.3247179572447454) ~ 0 ");
	}
}
