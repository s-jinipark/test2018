package imsi.office.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class E11_5 {

	/*
	[11-5] ������ ���õ� StudentŬ������ Comparable�������̽��� �����ϵ��� �����ؼ�
	�̸�(name)�� �⺻ ���ı����� �ǵ��� �Ͻÿ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add(new Student("ȫ�浿",1,1,100,100,100));
		list.add(new Student("���ü�",1,2,90,70,80));
		list.add(new Student("���ڹ�",1,3,80,80,90));
		list.add(new Student("���ڹ�",1,4,70,90,70));
		list.add(new Student("���ڹ�",1,5,60,100,80));
		//[2]
		list.add(new Student("���ں�",1,10,60,100,80));
		list.add(new Student("���ڹ�",1,15,60,100,80));		
		list.add(new Student("���ڹ�",1,11,60,100,80));	
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			
	}

}

//class Student {
	// Exception in thread "main" java.lang.ClassCastException: 
	// kr.co.imsi.Student cannot be cast to java.lang.Comparable
class Student implements Comparable {
	//	- The type Student must implement the inherited abstract method 
	// Comparable.compareTo(Object)
	String name;
	int ban;
	int no;
	int kor, eng, math;
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public String toString() {
		return name +","+ban +","+no +","+kor +","+eng +","+math
		+","+getTotal() +","+getAverage();
	}
	
	public int compareTo( Object o) {
	
		if(o instanceof Student) {
			Student tmp = (Student)o;
			//return name.compareTo(tmp.name); // StringŬ������ compareTo()�� ȣ��
			// (2)
			if (name.compareTo(tmp.name) == 0) {
				if (no == tmp.no) return 0;
				else if (no > tmp.no) return 1;
				else return -1;
			} else {
				return name.compareTo(tmp.name); // StringŬ������ compareTo()�� ȣ��
			}
			
		} else {
			return -1;
		}
	}
}
