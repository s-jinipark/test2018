package kr.co.infopub.chap178.test;
import java.io.*;

import kr.co.infopub.chap178.ReadAndWriteFromFile;
public class ReadAndWriteFromFileMain 
{
	public static void main(String[] args) 
	{
		String fname="aaa.txt";
		ReadAndWriteFromFile baw=new ReadAndWriteFromFile();
		try{
			//ctrl+c �ܼ� :  ��Ŭ���� ctrl+Z
			System.out.println("������ �ʹٸ� ctrl+Z�� �Է��Ͻÿ�");
			baw.readnwrite(fname,false);//clear
			//baw.readnwrite(fname,true);//append
			//����ϱ�
			baw.readFile(fname);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}
