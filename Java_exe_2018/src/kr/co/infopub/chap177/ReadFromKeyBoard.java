package kr.co.infopub.chap177;
import java.io.*;
public class ReadFromKeyBoard {

	public static void main(String[] args) {
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String s="";
			//ctrl+c �ܼ� :  ��Ŭ���� ctrl+Z
		    System.out.println("������ �ʹٸ� ctrl+Z�� �Է��Ͻÿ�");
			while((s=br.readLine())!=null){//ctrl+z
				 System.out.println(s);//���
			}
			br.close();
			isr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
