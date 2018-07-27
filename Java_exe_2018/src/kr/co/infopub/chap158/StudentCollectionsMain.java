package kr.co.infopub.chap158;
import java.util.*;
public class StudentCollectionsMain {

	public static void main(String[] args) {
		GradeComparator gc=GradeComparator.getInstance();
		//���� 
		Vector<Student> v=new Vector<>(5,5);
		//Student [] sg=new Student[7];
		//�ʱ�ȭ
		Student stu1=new Student("�踻��",101001,"����");
		Student stu2=new Student("ȫ�浿",101002,"���");
		Student stu3=new Student("�ּ���",101003,"��õ");
		Student stu4=new Student("�̿���",101004,"�λ�");
		Student stu5=new Student("����ȣ",101005,"â��");
		Student stu6=new Student("����",101006,"����");
		Student stu7=new Student("��ҿ�",101007,"����");

		v.add(stu1);
		v.add(stu2);
		v.add(stu3);
		v.add(stu4);
		v.add(stu5);
		v.add(stu6);
		v.add(stu7);

		stu1.setGrade(new Grade(60,60,70));
		stu2.setGrade(new Grade(89,65,67));
		stu3.setGrade(new Grade(60,80,100));
		stu4.setGrade(new Grade(70,99,80));
		stu5.setGrade(new Grade(60,70,80));
		stu6.setGrade(new Grade(60,80,80));
		stu7.setGrade(new Grade(73,70,80));
		System.out.println("�Է¼� ���==============");
		prints(v);
		System.out.println("�Է� ���� ���==============");
		Collections.reverse(v);
		prints(v);
		System.out.println("���Ƿ� ���� �� ���==============");
		Collections.shuffle(v);
		prints(v);
		System.out.println("������ ���==============");
		Collections.sort(v,gc);
		prints(v);
	}
	public static void prints(Vector<Student> v){
		int num=v.size();
		for(int i=0;i<num;i++){
			Student stu=v.get(i);
		    System.out.println(stu);
	   }//for      
	   System.out.println();
	}//prints    
}
