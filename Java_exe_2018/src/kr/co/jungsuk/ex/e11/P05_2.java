package kr.co.jungsuk.ex.e11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P05_2 {
	/*
		(2) 정렬 관련 테스트
	*/
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student2("홍길동",2,1,100,100,100));
		list.add(new Student2("김자바",2,3,80,80,90));
		list.add(new Student2("이자바",1,4,70,90,70));
		list.add(new Student2("홍길동",1,1,100,100,100));
		list.add(new Student2("김자바",3,5,80,80,90));
		list.add(new Student2("이자바",3,4,70,90,70));
		list.add(new Student2("안자바",2,5,60,100,80));
		list.add(new Student2("홍길동",1,1,100,100,100));
		list.add(new Student2("김자바",3,3,80,80,90));
		list.add(new Student2("이자바",3,4,70,90,70));
		list.add(new Student2("안자바",3,5,60,100,80));
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

//class Student {
// 변경
class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	Student2(String name, int ban, int no, int kor, int eng, int math) {
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
	
//	public int compareTo(Object o) {
//		if(o instanceof Student2) {
//			Student2 tmp = (Student2)o;
//			return name.compareTo(tmp.name); // String클래스의 compareTo()를 호출
//		} else {
//			return -1;
//		}
//	}
	// 위는 이름순으로 정렬
	// (2) 이름 -> 반 정렬
	public int compareTo(Object o) {
		if(o instanceof Student2) {
			Student2 tmp = (Student2)o;
			//return name.compareTo(tmp.name); // String클래스의 compareTo()를 호출
			if (name.compareTo(tmp.name) < 0) return -1;
			else if (name.compareTo(tmp.name) > 0) return 1;
			else {
				// 반으로 정렬(2차)
				//return ban - tmp.ban;
				
				// (3) 번호 까지 정렬
				if (ban - tmp.ban <0) return -1;
				else if (ban - tmp.ban >0) return 1;
				else {
					return no - tmp.no;
				}
				
			}
		} else {
			return -1;
		}
	}
}
