package kr.co.infopub.chap177;
import java.io.*;
public class ReadFromFile {

	public static void main(String[] args) {
		//String fname="ReadFromKeyBoard.java";//eclipse �ƴҶ�
		String fname="src\\kr\\co\\infopub\\chap177\\ReadFromKeyBoard.java";//eclipse
		try{
			FileReader fr=new FileReader(fname);
			BufferedReader br=new BufferedReader(fr);
			StringBuffer sb=new StringBuffer();
			String s="";
		    while((s=br.readLine())!=null){
				sb.append(s+"\n");
			}
			s=sb.toString();
			System.out.println(s);
			br.close();
			fr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
