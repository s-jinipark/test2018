package kr.co.infopub.chap155;
import java.util.*;
public class StudentVectorTest2 {

	public static void main(String[] args) {
		Vector<Student> v=new Vector<>(2,5);    
		v.add(new Student("Jee",1,"Seoul"));//0
		v.add(new Student("Gong",2,"Seoul"));//1
		v.add(new Student("Song",3,"Seoul"));//2
		v.add(new Student("Chang",4,"koyang"));//3
		print(v);
		Collections.shuffle(v);//�������� ���´�.
		print(v);
	}
	public static void print(List<Student> list){
		System.out.println("-----------------------------");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			Student stu=list.get(i);//index�� 0����
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAddr());
		}
	}
}
