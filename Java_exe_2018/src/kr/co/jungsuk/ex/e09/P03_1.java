package kr.co.jungsuk.ex.e09;

public class P03_1 {
	// [9-3] ������ ���� �������� �������� �ڵ带 �ϼ��Ͻÿ�.
	/*
	[������]
		fullPath:c:\jdk1.8\work\PathSeparateTest.java
		path:c:\jdk1.8\work
		fileName:PathSeparateTest.java
	*/
	public static void main(String[] args) {

		String fullPath = "C:\\dev\\git\\test2018\\Java_exe_2018\\src\\kr\\co\\jungsuk\\ex\\e09\\P02_1.java";
		String path = "";
		String fileName = "";
		
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		int tmp_indx = fullPath.lastIndexOf("\\");
		System.out.println(">:"+tmp_indx);	
		
		path = fullPath.substring(0, tmp_indx);
		fileName = fullPath.substring( tmp_indx+1 );
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}