package kr.co.infopub.chap131;
public class MathSqrt {
	
	private double a;
	private double xMin;
	public MathSqrt(double a,double xInit){
		xMin=xInit;
		this.a=a;
	}
	public MathSqrt(){
	}
	private double mean(){
		return xMin=(a/xMin+xMin)/2.0;
	}
	public double fuctValue(){
		double temp=xMin;//

		if(a<=0){
			return temp=0;  //����ó���� ���� �ʰ� 0���� ���� 
		}
		if(xMin==0){  //0�̸� �������� ���� �Űܼ� ����
			xMin+=MathEnd.MIDDLE;
		}
		if(xMin<0){       //������ ������ ����� ���� ����
			xMin=Math.abs(xMin);
		}

		while(Math.abs(a/xMin-xMin)>MathEnd.END){
			temp=mean();  //�������� ���ؼ� ��������� �����ϵ���
		}//while
		
		return temp;
	}//
	public double getA() {//�������� ���Ϸ��� �ϴ� ��
		return a;
	}
	public double getXMin() {//������
		return xMin;
	}
	public void setA(double d) {//�������� ���Ϸ��� �ϴ� ��
		a = d;
	}
	public void setXMin(double d) {//������
		xMin = d;
	}
}
