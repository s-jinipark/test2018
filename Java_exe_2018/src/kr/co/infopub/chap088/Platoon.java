package kr.co.infopub.chap088;
public class Platoon {//�Ҵ� 
	private String name;
	public Platoon(){ //���� 4�д�
		name="Platoon";
	}
	public Platoon(String name){
		this.name=name;
	}
	public String getPlatoonName(){
		return name;
	}
	public void showPlatoonName(){
		System.out.println("The "+name+" platoon.");
	}
}
