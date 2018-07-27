package kr.co.infopub.chap179;
import java.io.*;
public class WritingDatasUsing {
	public void writingData(String fname, boolean append, WritingData wd)
	  throws IOException{
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			fos=new FileOutputStream(new File(fname), append);
			dos=new DataOutputStream(fos);
			dos.writeUTF(wd.getName());
			dos.writeInt(wd.getAge());
			dos.writeDouble(wd.getHeight());
			dos.writeBoolean(wd.isMan());
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է��߽��ϴ�.");
		}
	}
	public WritingData readingData(String fname)throws IOException{
		FileInputStream fis=null;
		DataInputStream dis=null;
		WritingData wd=new WritingData();
		try {
			fis=new FileInputStream(new File(fname));
			dis=new DataInputStream(fis);
			wd.setName(dis.readUTF());
			wd.setAge(dis.readInt());
			wd.setHeight(dis.readDouble());
			wd.setMan(dis.readBoolean());
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է��߽��ϴ�.");
		}
		return wd;
	}
}
