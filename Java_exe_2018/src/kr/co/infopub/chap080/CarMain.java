package kr.co.infopub.chap080;
public class CarMain {

	public static void main(String[] args) {
		
		Car car1=new Car(); //[2] speed, direct 0 ���� �ʱ�ȭ
		car1.speedUp();
		car1.speedDown();
		car1.speedUp();
		System.out.println(car1.curSpeed());
		car1.turnDirect(-30);//30�� ������
		car1.turnDirect(10); //10�� ����
		System.out.println(car1.curDirect());
	}
}