package kr.co.infopub.chap006.test;
//��Ű���� �ٸ��� import
import kr.co.infopub.chap006.HelloComment;

public class HelloCommentMain 
{
	public static void main(String[] args) 
	{
		HelloComment hc=new HelloComment();
		//%n enter(next line)
		System.out.printf("12345691�� �ڼ��ϱ�? %b%n"
		,hc.isPri(12345691));//59�� ��������
	}
}
