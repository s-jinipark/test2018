package kr.co.infopub.chap099;
public class WoodAnt extends Ant {
	private String where="wood";
	public void hate(){
		System.out.println(where+"��");
	}
	public void print(){
		System.out.println(getName()+"�� "+where+"�� ���.");
	}
}
