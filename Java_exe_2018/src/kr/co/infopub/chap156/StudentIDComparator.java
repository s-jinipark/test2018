package kr.co.infopub.chap156;
import java.util.Comparator;
public class StudentIDComparator implements Comparator{
	//�̱��� ������ ������ �̿�����.
	private static StudentIDComparator lc
			=new StudentIDComparator();
	private  StudentIDComparator(){} 
	public static StudentIDComparator getInstance(){
		return lc;
	}
	//Comparator������ ���� �� �޼���
	public int compare(Object o1, Object o2) {
   		Student sid1  = ((Student)o1);
   		Student sid2  = ((Student)o2);
   		if(sid1.getId()>sid2.getId()){
			return 1;//ũ��.//������
		}else if(sid1.getId()==sid2.getId()){
			return 0;
		}else{
			return -1;
		}
	}
	/*
	//���� ���������� compareTo�� �̿�
	public int compare(Object o1, Object o2) {
   		Student sid1  = (Student)o1;
   		Student sid2  = (Student)o2;
   		return sid1.compareTo(sid2);
	}*/
}
