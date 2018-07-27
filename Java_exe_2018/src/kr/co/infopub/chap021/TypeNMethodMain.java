package kr.co.infopub.chap021;

import kr.co.infopub.chap024.Student;

public class TypeNMethodMain {

	public static void main(String[] args) {
		//primitive type
		int myId=1001;
		int yourID=1002;
		//Reference type -- Predefined
		String myName="hyonny";
		String yourName=new String("Gagamel");
		//Reference type -- Userdefined
		Student stu=new Student();
		stu.setId(yourID);
		stu.setName(yourName);
		//method calling
		printInfor(myId,myName);
		printInfor(stu);
		
	}
	public static void printInfor(int id, String name){
//		System.out.println("ID�� "+id+", �̸��� "+name+"�̴�.");
		System.out.printf("ID�� %d, �̸��� %s�̴�.%n",id,name);
	}
	public static void printInfor(Student st){
//		System.out.println("ID�� "+st.getId()+
//                               ", �̸��� "+st.getName()+"�̴�.");
		System.out.printf("ID�� %d, �̸��� %s�̴�.%n",
		                              st.getId(),st.getName());
	}
}
