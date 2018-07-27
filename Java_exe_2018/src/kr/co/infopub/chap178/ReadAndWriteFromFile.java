package kr.co.infopub.chap178;
import java.io.*;
public class ReadAndWriteFromFile{
   public void readFile(String fn) throws IOException{
		FileReader fr=new FileReader(fn);
		BufferedReader br=new BufferedReader(fr);
		StringBuffer sb=new StringBuffer();
		String temp="";
		while((temp=br.readLine())!=null){
			sb.append(temp+"\n");
		}
		System.out.println(sb.toString());
		br.close();
		fr.close();
   }
   public void readnwrite(String fn, boolean append) throws IOException{
		String s=null;
		FileWriter fw=new FileWriter(fn,append);//append true
		PrintWriter pw=new PrintWriter(fw);//flush false
		//PrintWriter pw=new PrintWriter(fw, true);//flush true 
		while((s=readbuff())!=null){   //CTRL+C
			pw.println(s);
			pw.flush();//PrintWriter(fw, true)�� ���� �ʿ����.
		}
		pw.close();
		fw.close();
   }
   public String readbuff() throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		return br.readLine();
	}
}
