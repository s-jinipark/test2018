package kr.co.infopub.chap173;
import java.io.*;
import java.util.*;
public class FileDirectoryMaking {

	public boolean make(String fname){//�������� �ʴ� ���� �����
		File f=new File(fname);
		if(f.isDirectory() && f.exists()){
			System.out.println(fname+"�� �̹� ������");
			return false;
		}
		f.setLastModified(new Date().getTime());//������
		return f.mkdir();
	}//
	public boolean renameTo(String fname, String newName){
		File f=new File(fname);//�����ϴ� �����̸� �ٲٱ�
		if(!f.exists()){
			System.out.println(fname+"�� ����.");
			return false;
		}
		f.setLastModified(new Date().getTime());//������
		return f.renameTo(new File(newName));
	}//
	public boolean delete(String fname){
		File f=new File(fname);//�����ϴ� �����̸� �ٲٱ�
		if(!f.exists()){
			System.out.println(fname+"�� ����.");
			return false;
		}
		//cf f.deleteOnExit();
		return f.delete();//
	}//
}
