package kr.co.infopub.chap159;
import java.util.*;
public class BoxingUnBoxingMain3 {

	public static void main(String[] args) {
		Vector<Student> v=new Vector<Student>(5,5);
		Student sg1 = new Student("�踻��",101001,"����");
		Student sg2 = new Student("ȫ�浿",101002,"���");
		Student sg3 = new Student("�ּ���",101003,"��õ");
		v.add(sg1);  
		v.add(sg2);   
		v.add(sg3);
		prints(v);
	}
	public static void prints(Vector<Student> vi){
		int num=vi.size();
		for(int j=0;j<num;j++){
			System.out.println(vi.get(j).getName()+"  "+vi.get(j).getId());
	   }//for
	}//prints
}
