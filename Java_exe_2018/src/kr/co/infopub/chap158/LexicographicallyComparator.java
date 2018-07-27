package kr.co.infopub.chap158;
import java.util.Comparator;
public class LexicographicallyComparator 
   implements Comparator<Student>{
	//�̱��� ������ ������ �̿�����.
	private static LexicographicallyComparator lc
			=new LexicographicallyComparator();
	private  LexicographicallyComparator(){} 
	public static LexicographicallyComparator getInstance(){
		return lc;
	}
	//Comparator������ ���� �� �޼���
	public int compare(Student o1, Student o2) {
   		String sc1 = o1.getName();
   		String sc2 = o2.getName();
   		return sc1.compareTo(sc2);
	}
	//toString�� ���� ���ϸ� Object toString���
}
