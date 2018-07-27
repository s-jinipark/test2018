package kr.co.infopub.chap172;
import java.io.*;
import java.util.*;
public class FileSearch {
	public void printDirectory(String fname)throws IOException{
		File f=new File(fname);
		if(f.exists()){
			System.out.println("������: "+f.getAbsolutePath());//
			System.out.println("(�빮��)������: "+f.getCanonicalPath());//throws
			System.out.println("������¥: "+new Date(f.lastModified()));//������¥
			System.out.println("Read����? "+f.canRead());//
			System.out.println("Write����? "+f.canWrite());//
			if(f.isDirectory()){
				System.out.println("���丮�ΰ�? "+f.isDirectory());//
				File []fs= f.listFiles();
				for(int i=0; i<fs.length;i++){
					if(fs[i].isDirectory()){
						System.out.println(fs[i].getAbsoluteFile());//������
					}
				}
			}else{
				System.out.println("�����̸� : "+f.getName());//�����̸�
				System.out.println("���� ���� : "+f.length()+" byte");//���ϱ���
				System.out.println("���� �����ΰ�? "+f.isHidden());
				System.out.println("���ϱ��й��� "+File.pathSeparatorChar);
				System.out.println("��α��й��� "+File.separator);//��α��й���
			}
		}else{
			System.out.println(fname+"�� ����.");
			System.exit(1);
		}
	}
}
