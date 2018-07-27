package kr.co.infopub.chap150;
public class Student_100 implements Cloneable
{
	private String name;
	private int id;
	private String addr;
	
	public Student_100(String name, int id,String addr) {
		this.name=name;
		this.id=id;
		this.addr=addr;
	}//Student
	public String getAddr() {return addr;}
	public int getId() {return id;}
	public String getName() {return name;}
	public void setAddr(String string) {addr = string;}
	public void setId(int i) {id = i;}
	public void setName(String string) {name = string;}
	public String toString(){
		return name+"   "+id+"    "+addr;
	}//toString
	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			return this;
		}
	}//clone
	//�� ���ǿ��� �߰��� ��ġ
}
