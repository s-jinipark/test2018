package kr.co.infopub.chap138.one;


public class MyMotherFriendSecret {
	private String address="���α�";
	public MyMotherFriendSecret(String address){
		this.address=address;
	}
	public MyMotherFriendSecret(){
		this("������");
	}
	public String getAddress(){
		return address;
	}
	public void seeMyMother(MyMotherSecret mym){
		StringBuffer sb=new StringBuffer();
		sb.append("�츮��������:"+mym.age+",");//protected
		sb.append("�츮����������:"+mym.blood+",");//default
		sb.append("�츮�������ڱ�:"+mym.getSlushMoney());//
		System.out.println(sb.toString());
	}
}
