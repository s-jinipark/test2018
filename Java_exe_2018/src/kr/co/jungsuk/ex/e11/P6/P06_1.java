package kr.co.jungsuk.ex.e11.P6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class P06_1 {
	/*
		[11-6] 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다. TreeSet이 학
		생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와 평균점수의 범위를
		주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라.
		[Hint] TreeSet의 subSet(Object from, Object to)를 사용하라.
	*/
	static int getGroupCount(TreeSet tset, int from, int to) {
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		Student s1 = new Student("",0,0,from,from,from);
		Student s2 = new Student("",0,0,to,to,to);
		return tset.subSet(s1,s2).size();
	}
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				/*
				(2) 알맞은 코드를 넣어 완성하시오.
				*/
				if (o1 instanceof Student && o2 instanceof Student) {
					if ( ((Student)o1).getAverage() > ((Student)o2).getAverage() ) return 1;
					else if ( ((Student)o1).getAverage() == ((Student)o2).getAverage() ) return 0;
					else return -1;
				} else {
					return -1;
				}
			}
		});
		set.add(new Student("홍길동",1,1,100,100,100));
		set.add(new Student("남궁성",1,2,90,70,80));
		set.add(new Student("김자바",1,3,80,80,90));
		set.add(new Student("이자바",1,4,70,90,70));
		set.add(new Student("안자바",1,5,60,100,80));
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~100] :"+getGroupCount(set,90,101));
	}
}

//class Student {
// 변경
class Student implements Comparable {
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
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
}
