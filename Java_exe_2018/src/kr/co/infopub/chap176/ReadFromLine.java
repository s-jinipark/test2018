package kr.co.infopub.chap176;
import java.io.*;
public class ReadFromLine {

	public static void main(String[] args) {
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			LineNumberReader br=new LineNumberReader(isr);
			StringBuffer sb=new StringBuffer();
			String s="";
			//ctrl+c �ܼ� :  ��Ŭ���� ctrl+Z
			System.out.println("������ �ʹٸ� ctrl+Z�� �Է��Ͻÿ�");
			while((s=br.readLine())!=null){
			     sb.append( br.getLineNumber()+" "+s+"\n");
			}
			System.out.println(sb.toString());
			br.close();
			isr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
