package kr.co.infopub.chap155;
import java.util.*;
public class StudentHashtableTest {

	public static void main(String[] args) {
		Hashtable<String,Student> table=new Hashtable<>();
		table.put("1",new Student("Jee",1,"Seoul"));//0
		table.clear();//��� ����
		table.put("2",new Student("Gong",2,"Seoul"));//1
		table.put("3",new Student("Song",3,"Seoul"));//2
		table.put("4",new Student("Lee",4,"Koyang"));//3
		table.put("4",new Student("Lee",4,"Koyang"));//3�� �ߺ�x
		System.out.println(table.size());
		System.out.println(table.containsKey("4"));
		table.remove("3"); 
		Student stu=table.get("2");//key
		System.out.println(stu.getId()+"  "+stu.getName()+"  "+stu.getAddr());
		//��� elements ����ϱ�
		//Set set=table.keySet();//Map�� ����
		Enumeration<String> enums=table.keys();
		while(enums.hasMoreElements()){
			String key=enums.nextElement() ;//�ٽ�
			Student stus=table.get(key);
			System.out.println(stus.getId()+"  "+stus.getName()+"  "+stus.getAddr());
		}
	}
	/*
	Iterator, Enumeration�� �Ѵ� ��� �ڹٿ��� �����ϴ� �÷��ǿ� ���� 
	�� �÷����� �׸���� ���������� �����ϴµ� ����Ѵ�.

    �������� Enumeration�� ��� �ڹ��� �ʱ�������� ���ߵǾ����ϴ�. 
    �ڹٴ� jdk1.2, �� �ڹ�2���� ���� ��ȭ�� ����µ�, 
    ���߿� �ϳ��� �÷��� Ŭ����(Vector, List, Map, Set...)���� 
    �÷��������ӿ� �̶�°����� �����ϴ°��̴�.

    �̶�, �÷��������ӿ������� Iterator��� �ؼ�, Enumeration�� ����� Ȯ���ؼ�, 
    Collection�������̽��� ��ӹ��� ��� �÷���(List, Set, Vector.)���� Enumeration�� ��밡���ϰ� �Ͽ���.

    �����ϸ�, Enumeration�� �ڹ��ʱ�������� �����Ǵ°����� Hashtable, Vector ���� ��밡���ϴ�. 
    Iterator�� jdk1.2���� �����Ǵ� ������ 
    Collection�������̽��� ��������� ��� �÷��� Ŭ�������� ��밡���ϴ�. 
	*/
}
