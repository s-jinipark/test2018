package kr.co.infopub.chap155;
import java.util.*;
public class StudentShuffleTest {
	public static void main(String[] args) {
		Vector<Student> v=new Vector<>(2,5);    
		v.add(new Student("Jee",1,"Seoul"));//0
		v.add(new Student("Gong",2,"Seoul"));//1
		v.add(new Student("Song",3,"Seoul"));//2
		System.out.println("cap : " + v.capacity());
		print(v);
		Collections.shuffle(v);//�������� ���´�.
		print(v);
	}
	public static void print(List<Student> list){
		System.out.println("-----------"+list.size());
		for(int i=0;i<list.size();i++){
			Student stu=list.get(i);//index�� 0����
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAddr());
		}
	}
	/*
	Vector Ŭ������ ������ 		����

 	Vector()					10���� �����͸� ������ �� �ִ� ������ ��ü�� �����Ѵ�. 
								���� ������ ������ ��� 10���� �����Ѵ�. 

 	Vector(int size) 			size ���� �����͸� ������ �� �ִ� ������ ��ü�� �����Ѵ�. 
								��������� ������ ��� size���� �����Ѵ�. 

 	Vector(int size, int incr)	size ���� �����͸� ������ �� �ִ� ������ ��ü�� �����Ѵ�. 
								���� ������ ������ ��� incr ���� �����Ѵ�.
	*/
}
