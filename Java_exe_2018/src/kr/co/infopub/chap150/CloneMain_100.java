package kr.co.infopub.chap150;
public class CloneMain_100 {

	public static void main(String[] args) {
		Student_100 st=new Student_100("����",6,"���� ���۱� ��Ѱ���");
		System.out.println("1 st  "+st);
		Student_100 st1=st;//shallow copy
		st1.setAddr("��� ����");//
		st1.setId(3);//
		System.out.println("----------");
		System.out.println("2 st  "+st);
		System.out.println("2 st1 "+st1);
		//���� ����
		System.out.println("----------");
		Student_100 sts=(Student_100)st.clone();//deepcopy
		System.out.println("3 sts "+sts);
		sts.setAddr("���� ���");
		sts.setId(5);
		System.out.println("4 st  "+st);
		System.out.println("5 sts "+sts); 
		// Student_100 �� Cloneable �� ���ٸ� .. 4,5 ����
		// 				  Cloneable �� ������ .. 4,5 �ٸ��� ����
	}
}
