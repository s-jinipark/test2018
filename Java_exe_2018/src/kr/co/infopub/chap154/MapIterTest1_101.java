package kr.co.infopub.chap154;
import java.util.*;
public class MapIterTest1_101 {

	public static void main(String[] args) {
		HashMap list=new HashMap();
		//list.put("0","lee");//0
		//list.clear();//��� ����
		//System.out.println(list.size());//size()
		list.put("a","cho");//1
		list.put("d","min");//4		
		list.put("b","kim");//2
		list.put("c","chung");//3
		list.put("c","jung");//3�� ���� ���� //[2] -> ���
		//System.out.println(list.size());//size()
		//System.out.println(list.containsKey("3"));
		//System.out.println("--------------------");
		//list.remove("2");//2���� key�� �̿�
		System.out.println(list.size());
		System.out.println("--------------------");
		//print(list);//Set �����
		
		Set set = list.keySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			String key = (String)itr.next();
			System.out.println(">" + key + " : " + list.get(key));
		}
		// ���ĵ�
	}
	public static void print(Map sets){
		Set set=sets.keySet();//key���� Set����
		Iterator iter=set.iterator();
		while(iter.hasNext()){
			String key=(String)iter.next();
			System.out.println(key+"  "+sets.get(key));//value
		}
	}//
	// Map �迭�� ���� ã��� ����� ������� �ܾ�(key) �� �̿��Ͽ� ��(value) �� ã�� �� �ִ�
}
