package kr.co.infopub.chap132;
public class BernardQuizKorMain {

	public static void main(String[] args) {

		BernardQuizKor quiz=new BernardQuizKor();
		//�츮���� 13 => 1�� 3�� 
		long a=System.currentTimeMillis();
		quiz.make(12);
		long b=System.currentTimeMillis();
		System.out.println((b-a)+"mmsec----------------------");
		
		for(int i=0;i<10;i++){
			quiz.make(i);
		}//
	}
}
