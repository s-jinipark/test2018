package kr.co.infopub.chap158;
import java.util.Comparator;
public class GradeComparator implements Comparator<Student>{
	private static GradeComparator gc
			=new GradeComparator();
	private  GradeComparator(){} 
	public static GradeComparator getInstance(){
		return gc;
	}
	//Comparator������ ���� �� �޼���
	/*
	public int compare(Object o1, Object o2) {
		Student sg1=(Student)o1;
		Student sg2=(Student)o2;
		double mean1=sg1.getGrade().getMean();
		double mean2=sg2.getGrade().getMean();
		if(mean1<mean2){
			return -1;  //increasing
		}else if(mean1==mean2){
			return 0;
		}else {
			return 1;  //decreasing
		}
	}*/
	public int compare(Student o1, Student o2) {
		Grade g1=o1.getGrade();//����
		Grade g2=o2.getGrade();
		return g1.compareTo(g2);//������
	}
}
