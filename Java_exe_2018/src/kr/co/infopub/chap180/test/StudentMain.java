package kr.co.infopub.chap180.test;

import java.util.ArrayList;
import java.util.Collections;

import kr.co.infopub.chap180.Grade;
import kr.co.infopub.chap180.GradeComparator;
import kr.co.infopub.chap180.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student("ȫ�浿", 101, "���� ������");
		Student s2=new Student("ȫ���", 102, "���� ���α�");
		Student s3=new Student("������", 103, "���� ���ı�");
		
		Grade g1=new Grade(100, 90, 80);
		Grade g2=new Grade(100, 90, 90);
		Grade g3=new Grade(70, 90, 85);
		
		s1.setGrade(g1);
		s2.setGrade(g2);
		s3.setGrade(g3);
			
		ArrayList<Student> lists=new ArrayList<>();
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
		
		GradeComparator gcp=GradeComparator.getInstance();
		
		System.out.println("-------before---------");
		print(lists);
		System.out.println("-------after----------");
		Collections.sort(lists,gcp);
		print(lists);
	}

	
	public static void print(ArrayList<Student> lists){
		for (Student st:lists) {
			System.out.println(st);
		}
	}
}
