package kr.co.infopub.chap132;
public class BernardQuizMain {

	public static void main(String[] args) {

		BernardQuiz quiz=new BernardQuiz();
		//�츮���� 13 => 1�� 3�� 
		long a=System.currentTimeMillis();
		quiz.make(12);
		long b=System.currentTimeMillis();
		System.out.println((b-a)+"mmsec----------------------");
		
		for(int i=0;i<10;i++){
			quiz.make(i);
		}//
		//�������� 31 => 3 of 1  => 1�� 3��
		System.out.println("---------------------------------");
		for(int i=0;i<10;i++){
			quiz.makef(i);
		}//
	}
}
