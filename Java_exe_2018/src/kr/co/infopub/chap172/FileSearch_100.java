package kr.co.infopub.chap172;
import java.io.*;
import java.util.*;
public class FileSearch_100 {
	//public void printDirectory(String fname)throws IOException{
	//[2]	
	public void printDirectory(String fname, String findFile )throws IOException{
		File dir = new File(fname); 

		File[] fileList = dir.listFiles(); 

		try{
			for(int i = 0 ; i < fileList.length ; i++){
				File file = fileList[i]; 
				if(file.isFile()){
					// ������ �ִٸ� ���� �̸� ���
					//System.out.println("\t ���� �̸� = " + file.getName());
					if( file.getName().equals(findFile) ) {
						System.out.println("\t ���� ���� : " + file.getName());
						System.out.println("\t ���� ��ġ : " + file.getCanonicalPath().toString());
					} 
				}else if(file.isDirectory()){
					//System.out.println("���丮 �̸� = " + file.getName());
					// ������丮�� �����ϸ� ����� ������� �ٽ� Ž��
					//printDirectory(file.getCanonicalPath().toString());
					printDirectory(file.getCanonicalPath().toString(), findFile);
					
				}
			}
		}catch(IOException e){
		}

		
//		File f=new File(fname);
//		if(f.exists()){
//			System.out.println("������: "+f.getAbsolutePath());//
//			System.out.println("(�빮��)������: "+f.getCanonicalPath());//throws
//			System.out.println("������¥: "+new Date(f.lastModified()));//������¥
//			System.out.println("Read����? "+f.canRead());//
//			System.out.println("Write����? "+f.canWrite());//
//			if(f.isDirectory()){
//				System.out.println("���丮�ΰ�? "+f.isDirectory());//
//				File []fs= f.listFiles();
//				for(int i=0; i<fs.length;i++){
//					if(fs[i].isDirectory()){
//						System.out.println(fs[i].getAbsoluteFile());//������
//					}
//				}
//			}else{
//				System.out.println("�����̸� : "+f.getName());//�����̸�
//				System.out.println("���� ���� : "+f.length()+" byte");//���ϱ���
//				System.out.println("���� �����ΰ�? "+f.isHidden());
//				System.out.println("���ϱ��й��� "+File.pathSeparatorChar);
//				System.out.println("��α��й��� "+File.separator);//��α��й���
//			}
//		}else{
//			System.out.println(fname+"�� ����.");
//			System.exit(1);
//		}
	}
}
