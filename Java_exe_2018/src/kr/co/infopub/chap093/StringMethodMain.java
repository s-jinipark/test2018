package kr.co.infopub.chap093;
public class StringMethodMain {

	public static void main(String[] args) {
		//1 String immutable
		String st="hello";
		System.out.println(st);
		st.replace('h','H');  //immutable hello
		System.out.println(st);
		st=st.replace('h','H');//st�� �Ҵ��� �޾ƾ� �Ѵ�. *****
		System.out.println(st);
		//2 String�� ��ġ  method index�� 0����
		String test1="Hello my nick name is totoro.\n";
		       test1+="I,m 29 years old.\n";
		       test1+="I'm a good boy.";
		System.out.println("�̱��� ���� : "+test1.length());
		System.out.println("ù ��° .��ġ  : "+test1.indexOf('.'));
		System.out.println("������° .��ġ  : "+test1.lastIndexOf('.'));
		System.out.println("ù ��° years��ġ  : "+test1.indexOf("years"));
		//indexOf -1�̸�  ����. 
		//3 ��ġ�� �ִ� �ѱ��ھ�  �θ���
		for(int i=0;i<test1.length();i++){
			System.out.print(test1.charAt(i));
		}
		System.out.println("\n--------------------");
		//4 ���ϴ� ���ڿ�  �迭 
		String [] a =test1.split("\n");
		System.out.println(a.length);
		System.out.println(a[0]);
		
		//5 ���ڿ� ������ index�� 0���� �����Ѵ�. 
		String b=test1.substring(4,8);
		String c=test1.substring(0,5);
		String bb=test1.substring(4);
		System.out.println(b); // 4��° ���ں��� (8-1)��° ���ڱ���
		System.out.println(c); // 0��° ���ں��� (5-1)��° ���ڱ���
		System.out.println(bb); //0��° ���ں��� (4-1)��° ���ڱ���
		System.out.println("--------------------");
		//6 ��ҹ��ڷ� 
		String d=test1.toUpperCase();
		System.out.println(d);
		String e=test1.toLowerCase();
		System.out.println(e);
		System.out.println("--------------------");		
		//7 ���� ��������
		System.out.println("  �ȳ��ϼ���   ".trim());
		//8 String<--> int
		int istr=Integer.parseInt("37");
		String stri=String.valueOf(istr);
		String stri2=istr+"";
		//9 ��ҹ� ������� ���ϱ�
		System.out.println("hello".compareToIgnoreCase("Hello"));
		//10 +�� ���� concatenation
		stri=stri.concat("hello");
		System.out.println(stri);
		//11 ���ڿ� <-->char �迭
		char [] chs=b.toCharArray(); //���ڿ��� char �迭��
		String copys1=String.copyValueOf(chs);//char �迭�� ���ڿ���
		String copys2=new String(chs);//char �迭�� ���ڿ���

		for(char ch : chs){
			System.out.printf("%c ",ch);
		}
		System.out.println("\n--------------------");		
		//12 String format
		String ss=String.format("%s %d %c %f","Hellos", 78, 'c', 8.6);
		System.out.println(ss);
		//13 ���ڸ� �����ϰ� �ִ°�?
		System.out.println("hello".contains("el"));
	}
}
