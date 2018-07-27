package kr.co.infopub.chap155;
import java.util.*;
public class StudentVectorTest {

	public static void main(String[] args) {
		Vector<Student> v=new Vector();     //capacity 10 increasing *2
		//Vector v=new Vector(5);  //capacity 5 increasing *2
		//Vector v=new Vector(5,5);//capacity 5 increasing 5
		v.add(new Student("Jee",1,"Seoul"));//0
		v.clear();//��� ����
		v.add(new Student("Gong",2,"Seoul"));//1
		v.add(new Student("Song",3,"Seoul"));//2
		v.add(new Student("Lee",4,"Koyang"));//3
		v.add(new Student("Lee",4,"Koyang"));//3�� �ߺ����
		System.out.println(v.size()+"  "+v.capacity());
		System.out.println(v.contains(new Student("Lee",4,"Koyang")));
		
		Student stu=(Student)v.elementAt(2);//index�� 0����
		System.out.println(stu.getId()+"  "+stu.getName()+"  "+stu.getAddr());
		//��� elements ����ϱ�
		Enumeration<Student> enums=v.elements();
		while(enums.hasMoreElements()){
			Student stus=(Student)enums.nextElement() ;
			System.out.println(stus.getId()+"  "+stus.getName()+"  "+stus.getAddr());
		}
	}
}
