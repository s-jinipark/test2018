package kr.co.infopub.chap011;
public class  EscapeTest
{
	public static void main(String[] args) 
	{
		System.out.printf("0        1         2         \n");
		System.out.printf("123456789012345678901234567890\n");
		System.out.printf("\t!\t!\n"); //8ĭ ����
		System.out.printf("\t!\t!"); //8ĭ ����
		System.out.printf("1234\b\b?"); //1ĭ ��
		System.out.printf("\n123456789\r?"); //�Ǿ�
		System.out.printf("%n"); //\n  Java5
		System.out.printf("%%"); //%   Java5
		System.out.printf("\n\'�ȳ��ϼ���?\'"); //'
		System.out.printf("\n\"�ȳ��ϼ���?\""); //'
		System.out.printf("\n\\�ȳ��ϼ���?\\"); //\
	}
}
