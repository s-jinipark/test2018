package kr.co.infopub.chap164;
public class  MyZeroException extends Exception{
	
	public MyZeroException(String message){
		super(message);
	}
	public MyZeroException(){
		this("���� �װ� �������!!");
	}
}