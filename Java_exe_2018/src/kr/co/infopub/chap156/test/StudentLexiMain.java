package kr.co.infopub.chap156.test;
import java.util.Arrays;

import kr.co.infopub.chap156.Student;
import kr.co.infopub.chap156.StudentIDComparator;
import kr.co.infopub.chap156.StudentLexiComparator;
public class StudentLexiMain {

	public static void main(String[] args) {

		StudentLexiComparator lc=
			   StudentLexiComparator.getInstance();
		StudentIDComparator idc=StudentIDComparator.getInstance();
		//����
		Student [] sg=new Student[7];
		//�ʱ�ȭ
		sg[0]=new Student("�踻��",101001,"����");
		sg[1]=new Student("ȫ�浿",101002,"���");
		sg[2]=new Student("�ּ���",101003,"��õ");
		sg[3]=new Student("�̿���",101004,"�λ�");
		sg[4]=new Student("����ȣ",101005,"â��");
		sg[5]=new Student("����",101006,"����");
		sg[6]=new Student("��ҿ�",101007,"����");
		
		System.out.println("�̸��� ���==============");
		Arrays.sort(sg,lc);
		prints(sg);

		System.out.println("id�� ���==============");
		Arrays.sort(sg,idc);
		prints(sg);
	}
	public static void prints(Student[] a){
		int num=a.length;
		for(int j=0;j<num;j++){
		   System.out.println(a[j]);
	   }//for
	   System.out.println();
	}//prints
}
