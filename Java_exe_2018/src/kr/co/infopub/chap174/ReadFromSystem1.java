package kr.co.infopub.chap174;
public class ReadFromSystem1 {

	public static void main(String[] args) {
		byte[] b=new byte[1024];
		int len=0;
        try{
			len=System.in.read(b);  //���� 102
        }
		catch(Exception e){ 
			System.out.println("�Է½���"); 
		}
		String str=new String(b,0,len-2);//'\n'�� '\r'�� �پ� �־  2�� ����.
		System.out.println(str);
		try{
			len=System.in.read(b);
		    System.out.write(b, 0, len);
        }
		catch(Exception e){ 
			System.out.println("�Է½���"); 
		}
	}
}
