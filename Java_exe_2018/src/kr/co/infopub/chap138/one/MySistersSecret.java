package kr.co.infopub.chap138.one;


public class MySistersSecret extends MyMotherSecret {
	private int weight=50;
	public MySistersSecret(int age,  String blood,
			double slushMoney,int weight){
		super(age,blood,slushMoney);
		this.weight=weight;
	}
	public MySistersSecret(){
		this(28,"A",200, 55);
	}
	public String toString(){
		return "����: "+super.age+",���ڱ�:"+super.getSlushMoney()+
		       ",������:"+super.blood+",������:"+this.weight;
	}
}
