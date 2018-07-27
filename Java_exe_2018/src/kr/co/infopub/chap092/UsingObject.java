package kr.co.infopub.chap092;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class UsingObject {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		Object obj2=new Object();
		
		System.out.println(obj1.hashCode());//native
		System.out.println(obj1==obj2);//��ü�� �����ϴ�.
		System.out.println(obj1.equals(obj2));//��ü�� �����ϴ�.
		System.out.println(obj1);
		System.out.println(obj2.toString());
			
		System.out.println(obj1.getClass().getName());//Ŭ�����̸�
		String str=obj1.getClass().getName() + "@" 
		           + Integer.toHexString(obj1.hashCode());
		System.out.println(str);//Ŭ�����̸�@16�����ؽ��ڵ�
		
		Object objstr=new String("Good");//������
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);
		System.out.println(objstr instanceof String);

		Class classes=obj1.getClass();
		System.out.println(classes.getName());//Ŭ�����̸�
		System.out.println("--------constructor-------");
		Constructor [] constructor = classes.getDeclaredConstructors();
		for(Constructor con: constructor){
			System.out.println(con.getName());
		}
		
		System.out.println("--------Method-------");
		Method [] method = classes.getMethods();
		for(Method me: method){
			System.out.println(me.getName());
		}
		
	}
}
