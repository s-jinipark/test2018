package kr.co.infopub.chap149;
public class SeaAirplaneUtil {
	public static void show(Plane p){
		System.out.print(p.power());
		p.fly();
	}
	public static void show(Ship s){
		System.out.print(s.move()+"���� �¿�� ");
		System.out.println(s.carry()+"���� �ư� ���� �ִ�.");
	}
	public static void show(SeaAirplane s){
		System.out.println(s);
	}
	public static void showOnly(Ship s){
		System.out.print(s.move()+"���� �¿�� ");
		System.out.println(s.carry()+"���� �ư� ���� �ִ�.");
	}
	public static void showPlane(Plane p){
		System.out.print(p.power());
		p.fly();
	}
}
