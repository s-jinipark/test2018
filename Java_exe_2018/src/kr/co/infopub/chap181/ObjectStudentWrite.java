package kr.co.infopub.chap181;
import java.io.*;
import java.util.Vector;
public class ObjectStudentWrite {
	public int write(String fname, Vector v) throws IOException{
	//public int write(String fname, Vector<Student> v) throws IOException{//JAVA5
		int objectNumber=0;
		try {
			FileOutputStream fos=new FileOutputStream(fname);
			ObjectOutputStream oos=new ObjectOutputStream(fos);//throws
			objectNumber=v.size();
			oos.writeInt(objectNumber);
			System.out.println(objectNumber+"���� Student�� �Էµ�");
			for(int i=0;i<objectNumber;i++){
				oos.writeInt(i);
				oos.writeObject((Student)v.get(i));
				//oos.writeObject(v.get(i));//JAVA5
				oos.flush();
				System.out.println(i+"��°��  Student�� �Էµ�");
			}
			oos.close();   fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է��߽��ϴ�.");
		} catch(Exception ee){
			throw new IOException("Ÿ���� �̻��մϴ�."+ee);
		}
		return objectNumber;
	}
	public void read(String fname) throws IOException{
		try {
			FileInputStream fis = new FileInputStream(fname);
			ObjectInputStream ois=new ObjectInputStream(fis);//throws
			int objectNumber=ois.readInt();
			System.out.println(objectNumber+"���� Student�� ����");
			for(int i=0;i<objectNumber;i++){
				try {
					System.out.print(ois.readInt()+"��° :");
					System.out.println((Student)ois.readObject());
				} catch (ClassNotFoundException e1) {
					System.out.println("�߸��� Ÿ���Դϴ�..");
				}
			}
			ois.close();  fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� �����̸��� �Է��߽��ϴ�.");
		}
	}
}
