package kr.co.infopub.chap135;
public class AirplaneMain {

	public static void main(String[] args) {
		Airplane air858=new Airplane();
		air858.nameOfAirp="�տ���";     //������̸�
		air858.fuel=6000;                 //liter
		//air858.fuel=100;   //100liter ���ϸ� ��������ε�??
		air858.goPerL=11;                 //1km/liter
		System.out.print("  ����� �̸�: "+air858.nameOfAirp);
		System.out.print("  ����Ÿ�   : "+air858.goPerL*air858.fuel+"km\n");
	}
}
