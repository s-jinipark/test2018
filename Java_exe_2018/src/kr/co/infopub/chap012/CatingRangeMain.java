package kr.co.infopub.chap012;
public class CatingRangeMain
{
	public static void main(String[] args) 
	{
		char cc='��';//
		System.out.println(cc);// char�� ����
		System.out.println((int)cc); // int�� �ٲپ� ����
		cc='��';//
		System.out.println(cc);// char�� ����
		System.out.println((int)cc); // int�� �ٲپ� ����
		cc='��';//
		System.out.println(cc);// char�� ����
		System.out.println((int)cc); // int�� �ٲپ� ����
		//int d=cc;
		//System.out.println(d);
		//System.out.println((char)d);


		System.out.println("---------------------------------");

		for(int i=1;i<=100;i++){
			System.out.print((char)i+" ");//��� ���� �߰� ���ڸ�
			// (char)i --> int�� char�� casting
			if((i%10==0)){// 10���� ������ �������� ��?
				System.out.println();//��ĭ�� ������
			}
		}

	}//
}
