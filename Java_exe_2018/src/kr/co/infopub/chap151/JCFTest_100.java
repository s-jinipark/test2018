package kr.co.infopub.chap151;
import java.util.*;
public class JCFTest_100 {
//JAVA COLLECTION FRAMEWORK
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("lee");//1
		set.add("lee");//1 �ߺ��ȵ�
		set.add(new Integer(23));//3  primitive �ȵ� java2
								 // �ڽ�/��ڽ��� �̿��Ͽ� �⺻Ÿ�� �Է�(Java 5)
		System.out.println(set);
		
		Set set2 = new HashSet();
		set2.add("first");
		set2.add("second");
		set2.add("second");		
		set2.add(12); // java8 .. �� !!!
		System.out.println(set2);
		
		System.out.println("--------------------");
		
		List list=new ArrayList();
		list.add("lee");//0
		list.add("lee");//1 �ߺ���
		list.set(0,"cho");//index ��ġ�� ����
		list.add("park");//
		list.add("park");//�ߺ���		
		System.out.println(list);
		
		Vector v=new Vector(5);
		v.addElement("lee");
		v.add("lee");
		v.set(1,"cho");
		v.setElementAt("kim",0); 
		System.out.println(v);
		
		System.out.println("--------------------");
		
		Map map=new HashMap(); 
		//Hashtable map=new Hashtable();
		map.put("1", new Integer(3));//primitive �ȵ� java2
		map.put("2","cho");
		map.put("2","cho");//key�ߺ� �ȵ�
		System.out.println(map);
		
		Map map2=new HashMap(); 
		map2.put("1", 33);// java8 .. �� !!!
		map2.put("2","cho");
		map2.put("2","cho2");//key�ߺ� �ȵ� -> ���
		System.out.println(map2);
		
		// Set �迭�� �������̽�. �������̽��� ������ HashSet �� ��ü�� ����
		// Set �迭�� ������ ���� �ߺ��� �� ���� ����
		// List �迭�� ������ ���� �Ϸķ� ������ �Ͱ� ������, ������ �ְ� �ߺ��� �� �ִ�
		// Map �迭�� ���� ã��� ����� ������� �ܾ�(key) �� �̿��Ͽ� ��(value) �� ã�� �� �ִ�
	}
}
