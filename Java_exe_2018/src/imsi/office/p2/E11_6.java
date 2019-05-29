package imsi.office.p2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class E11_6 {

	/*
	[11-6] ������ �ڵ�� ��������� �������� �л� ���� ���� ���� ���̴�. TreeSet�� ��
	������ ����� �������� �����ϵ��� compare(Object o1, Object o2)�� ��������� ������
	�ָ� �ش� ������ ���� �л��� ���� ��ȯ�ϴ� getGroupCount()�� �ϼ��϶�.
	[Hint] TreeSet�� subSet(Object from, Object to)�� ����϶�.
	 */
	static int getGroupCount(TreeSet tset, int from, int to) {
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Student s1 = new Student("",0,0,from,from,from);
		Student s2 = new Student("",0,0,to,to,to);
		return tset.subSet(s1,s2).size();
	}
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
			/*
			(2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/
				if(o1 instanceof Student && o2 instanceof Student) {
					Student tmp1 = (Student)o1;
					Student tmp2 = (Student)o2;
					//return tmp1.getAverage().compareTo(tmp2.getAverage());
					//return (int)(tmp2.getAverage() - tmp1.getAverage());
					//-> java.lang.IllegalArgumentException: fromKey > toKey
					return (int)(tmp1.getAverage() - tmp2.getAverage());
					
				} else {
					return -1;
				}
			}
		});
		set.add(new Student("ȫ�浿",1,1,100,100,100));
		set.add(new Student("���ü�",1,2,90,70,80));
		set.add(new Student("���ڹ�",1,3,80,80,90));
		set.add(new Student("���ڹ�",1,4,70,90,70));
		set.add(new Student("���ڹ�",1,5,60,100,80));
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~100] :"+getGroupCount(set,90,101));
	}

}

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
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
		return name
			+","+ban
			+","+no
			+","+kor
			+","+eng
			+","+math
			+","+getTotal()
			+","+getAverage()
			;
	}
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
} // class Student