package kr.co.infopub.chap138.two;
import kr.co.infopub.chap138.one.MyMotherSecret;

public class MyTopSecret extends MyMotherSecret{
	String myBoyFriend="CSharp";// default
	public MyTopSecret(int age,  String blood,
			double slushMoney,String myBoyFriend){
		super(age,blood,slushMoney);
		this.myBoyFriend=myBoyFriend;
	}
	public MyTopSecret(){
		this(28,"A",200,"Jim");
	}
	public String toString(){
		//blood�� ������ ����� ����. 
		return "����: "+super.age+",���ڱ�: "+super.getSlushMoney()+
		       ",����ģ��:"+this.myBoyFriend;
	}
}
