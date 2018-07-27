package kr.co.infopub.chap152;
import java.util.*;
public class SetIterTest1 {

	public static void main(String[] args) {
		HashSet list=new HashSet();
		list.add("lee");//0
		list.clear();//��� ����
		list.add("cho");//1
		list.add("kim");//2
		list.add("chung");//3
		list.add("min");//4
		list.add("chung");//3�� ����
		System.out.println(list.size());//size()
		System.out.println(list.contains("chung"));
		list.remove("kim");//2����
		System.out.println(list.size());
		System.out.println("--------------------");
		print(list);
		System.out.println("--------------------");
		print(list.toArray());
	}
	public static void print(Set set){
		Iterator iter=set.iterator();
		while(iter.hasNext()){
			String str=(String)iter.next();
			System.out.println(str);
		}
	}//
	public static void print(Object [] obj){
		int count=obj.length;
		for(int i=0;i<count;i++){
			System.out.println(obj[i]);
		}
	}//
}
