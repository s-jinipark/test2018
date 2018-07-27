package kr.co.infopub.chap149;
public class SeaAirplane extends Plane implements Ship {
	private String id="Air Balls";
	public SeaAirplane(String id){
		this.id=id;
	}
	public SeaAirplane(){
		this("LeeMass");
	}
	//abstract
	public  void fly(){
		System.out.println("������ ������ �̿��ؼ� ���ư�");
	}
	public  int power(){
		return 10000;
	}
	//interface
	public int move(){
		return 5;
	}// ����� ��� �����°�
	public int carry(){
		return 300;
	}// ���⸦ �� �� �����°�
	
	public String toString(){
		return this.id+"��  "+power()+"��������  "+move()+"���� ������.";
	}
}
