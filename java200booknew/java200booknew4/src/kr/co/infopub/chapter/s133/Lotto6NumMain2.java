package kr.co.infopub.chapter.s133;
// 1~1000 ������ ���� �ٸ� 100��
public class Lotto6NumMain2 {
	public static void main(String[] args) {
		Lotto6Num lot=new Lotto6Num(1000,100);
		lot.randomMake();
		lot.print();
	}
}
