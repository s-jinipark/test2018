package kr.co.infopub.chap156.test;
import java.util.Arrays;

import kr.co.infopub.chap156.Student;
import kr.co.infopub.chap156.StudentIDComparator;
public class StudentIDMain {

	public static void main(String[] args) {

		StudentIDComparator idc=StudentIDComparator.getInstance();
		//����
		Student [] sg=new Student[7];
		//�ʱ�ȭ
		sg[0]=new Student("�踻��",101007,"����");
		sg[1]=new Student("ȫ�浿",101006,"���");
		sg[2]=new Student("�ּ���",101003,"��õ");
		sg[3]=new Student("�̿���",101004,"�λ�");
		sg[4]=new Student("����ȣ",101005,"â��");
		sg[5]=new Student("����",101001,"����");
		sg[6]=new Student("��ҿ�",101002,"����");
		
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
