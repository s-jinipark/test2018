package kr.co.infopub.chap151;
import java.util.*;
public class JCFTest {
//JAVA COLLECTION FRAMEWORK
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("lee");//1
		set.add("lee");//1 �ߺ��ȵ�
		set.add(new Integer(23));//3  primitive �ȵ� java2
		System.out.println(set);
		List list=new ArrayList();
		list.add("lee");//0
		list.add("lee");//1 �ߺ���
		list.set(0,"cho");//index ��ġ�� ����
		System.out.println(list);
		Vector v=new Vector(5);
		v.addElement("lee");
		v.add("lee");
		v.set(1,"cho");
		v.setElementAt("kim",0); 
		System.out.println(v);
		Map map=new HashMap(); 
		//Hashtable map=new Hashtable();
		map.put("1", new Integer(3));//primitive �ȵ� java2
		map.put("2","cho");
		map.put("2","cho");//key�ߺ� �ȵ�
		System.out.println(map);
	}
}
