package kr.co.infopub.chap111;
public class PointMain {

	public static void main(String[] args) {
		Point p1=new Point(0,0);
		Point p2=new Point(0,0);
		Point p3=new Point(4,3);
		System.out.println("p1==p2 ?"+(p1==p2));
		//equals overriding
		System.out.println("p1.equals(p2) ?"+(p1.equals(p2)));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());//hashCode�� ��ġ
		System.out.println(p2.hashCode());//hashCode�� ��ġ
		
		Point p4=new Point(p1);
		System.out.println(p4.hashCode());
		System.out.println("p1.equals(p4) ?"+(p1.equals(p4)));
	}
}
