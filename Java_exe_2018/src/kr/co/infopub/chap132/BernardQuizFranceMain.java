package kr.co.infopub.chap132;
public class BernardQuizFranceMain {

	public static void main(String[] args) {

		BernardQuizFrance quiz=new BernardQuizFrance();
		//�츮���� 13 => 1�� 3�� 
		long a=System.currentTimeMillis();
		quiz.makef(12);
		long b=System.currentTimeMillis();
		System.out.println((b-a)+"mmsec----------------------");
		//�������� 31 => 3 of 1  => 1�� 3��
		System.out.println("---------------------------------");
		for(int i=0;i<10;i++){
			quiz.makef(i);
		}//
	}
}
