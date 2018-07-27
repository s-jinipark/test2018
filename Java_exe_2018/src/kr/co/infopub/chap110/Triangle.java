package kr.co.infopub.chap110;
public class Triangle {
	//���ﰢ�� 
	public double area(double x){
		return Math.sqrt(3)/4.0*x*x;
	}
	//�̵ �ﰢ��  1/2 *�غ�*����  
	public double area(double x,double y){
		return 1.0/2.0*x*y;
	}
	//	�κ��� �κ� ���̿� ����  
	public double area(double x,double y, Radian rad){
		double radian=rad.getRad();
		return 1.0/2.0*x*y*Math.sin(radian);
	}
	//	�� ���� �� �簢 
	public double area(double x,Radian rad1, Radian rad2){
		double radian1=rad1.getRad();
		double radian2=rad1.getRad();
		return 1.0/2.0*x*x*Math.sin(radian1)*Math.sin(radian2)/Math.sin(radian1+radian2);
	}
	//����� ���� -- ������ ���̸� �ٶ� 
	public double area(double x,double y,double z){
		double s=(x+y+z)/2.0;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
}
