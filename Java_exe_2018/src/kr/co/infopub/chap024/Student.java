package kr.co.infopub.chap024;
public class Student {
	//member field
	private int id=100;
	private String name="ȫ�浿";
	
    //member method
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int i) {
		id = i;
	}
	public void setName(String string) {
		name = string;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}//class
