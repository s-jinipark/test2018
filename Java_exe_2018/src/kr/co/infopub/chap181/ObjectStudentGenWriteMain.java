package kr.co.infopub.chap181;
import java.io.IOException;
import java.util.Vector;
public class ObjectStudentGenWriteMain {
	public static void main(String[] args) {
		ObjectStudentWriteGen osw=new ObjectStudentWriteGen();
		Vector<Student> v=new Vector<Student>(5, 5);//JAVA5
		v.add(new Student("ȫ�浿",17,"�Ѿ�"));
		v.add(new Student("ȫ���",15,"��õ"));
		v.add(new Student("����",20,"ȭõ"));
		v.add(new Student("����",18,"��ô"));
		try {
			osw.write("stu.txt",v);
			osw.read("stu.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
