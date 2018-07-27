package kr.co.infopub.chap129;
/**
 *<p>����� �����Լ� �̻� ���� �Լ��� ǥ��</p>
 *<p>�迭�� ���ʺ��� ���, ����, 2��... ���� ǥ��</p>
 *<p>Ư���Լ����� ǥ������ ����</p>
 */
public class Function {
	
	private double x;
	private double []m;
	public Function(double x,double []m){
		this.x=x;
		this.m=m;
	}//
	public Function(double []m){
		this.m=m;
	}//
	public Function(){
	}//
	private double funct(double x,double n){
		return Math.pow(x,n);
	}//
	public double functs(){
		int count=m.length;
		double value=0.0;
		for(int i=0;i<count;i++){
			value+=(m[i]*funct(x,count-1-i));
		}
		return value;
	}
	public double[] getM() {//��� C*x^n���� C
		return m;
	}
	public double getX() {//C*x^n���� x
		return x;
	}
	public void setM(double[] ds) {//���
		m = ds;
	}
	public void setX(double d) {//C*x^n���� x
		x = d;
	}
}
