package kr.co.infopub.chap156;
import java.util.Comparator;
public class StudentLexiComparator implements Comparator{
	//�̱��� ������ ������ �̿�����.
	private static StudentLexiComparator lc
			=new StudentLexiComparator();
	private  StudentLexiComparator(){} 
	public static StudentLexiComparator getInstance(){
		return lc;
	}
	//Comparator������ ���� �� �޼���
	public int compare(Object o1, Object o2) {
   		String sc1 = ((Student)o1).getName();
   		String sc2 = ((Student)o2).getName();
   		return sc1.compareTo(sc2);
	}
	//toString�� ���� ���ϸ� Object toString���
}
