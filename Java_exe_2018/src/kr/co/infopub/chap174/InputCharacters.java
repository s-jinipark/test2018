package kr.co.infopub.chap174;
import java.io.*;
public class InputCharacters {

	public static void main(String[] args) {
		try{
			InputStreamReader in=new InputStreamReader(System.in);
			StringBuffer sb=new StringBuffer();
			StringBuffer sb2=new StringBuffer();
			int ch;
	        while ((ch = in.read()) != -1) {
	          if (ch != '\n') {//���ٴ����� �ޱ� ���ؼ�
	        	  sb.append((char)ch);
	          } else {//�������� ���̱� ���ؼ�
	          	sb2.append(sb.toString()+"\n");
	          	sb = new StringBuffer();//
	          }
	        }
			System.out.println(sb2.toString());
			in.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
