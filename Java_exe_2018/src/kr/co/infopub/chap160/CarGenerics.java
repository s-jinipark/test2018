package kr.co.infopub.chap160;
import java.util.*;
public class CarGenerics
{
	public static void main(String[] args) 
	{
		Vector <Car> vc=new Vector<Car>(5,5);
		vc.add(new Car());  
		vc.add(new Car());  
		vc.add(new Car());
		vc.add(new Taxi()); 
		vc.add(new Bus());
		Car c1=vc.get(1);
		c1.show();//Car
		vc.add(new Bus());//Car�� ���� Bus is Car
		Car c2=vc.get(3);//Car
		c2.show();//Taxi
		Vector <Bus> vb=new Vector<Bus>(5,5);
		vb.add(new Bus()); 
		vb.add(new Bus()); 
		vb.add(new Bus());
		//vc=vb;//error->ensure compile-time type safety //incompatible types
		System.out.println("-------------------------");
		Vector <? extends Car> vec=vb;//whild card
		for(Car c : vec){
			c.show();
			((Bus)c).move();
		}
	}
	//160 ���׸����� �Ķ����ȭ�� Ÿ�� �����ϱ� 

	//���׸���(Generics)�� ĳ�������� �ʰ� Ŭ������ �� �� �ְ� ���ִ� ���

	// - �Ķ����ȭ�� Ÿ��
	// - ���ϵ� ī��(wild card, ?) 
	// - �Ķ����ȭ�� �޼ҵ�
	// - ����ڰ� ������ �Ķ����ȭ�� Ÿ��

}

