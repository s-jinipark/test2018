package kr.co.infopub.chap094;
public class StringBufferMain_100 {

	public static void main(String[] args) {
		// StringBuffer ����
		StringBuffer sb1=new StringBuffer();
		//1 ��� ���̴� �Լ� mutable 
		sb1.append("�����ٶ�.")
		  .append("12345")
		  .append("abcde");
		System.out.println(sb1.toString()+sb1.hashCode());
		//2 replace
		//sb1.replace(0,2,"�� ���Ⱑ ���ſ�");
		//System.out.println(sb1.toString()+sb1.hashCode());
		//3 reverse
		sb1.reverse();
		System.out.println(sb1.toString()+sb1.hashCode());
		//4 delete
		//sb1.delete(10,15);
		//System.out.println(sb1.toString());
		//5 cal by reference, shallow copy
		//replaces(sb1);
		//System.out.println(sb1.toString());
	}
	public static void replaces(StringBuffer sb){
		sb.reverse();
		sb.replace(0,3,"GoGo");//0���� 2���� �� GoGo��
	}
}
