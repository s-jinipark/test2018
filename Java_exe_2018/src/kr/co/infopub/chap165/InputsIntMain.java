package kr.co.infopub.chap165;
public class InputsIntMain {
	public static void main(String[] args) {
		InputsInt ins=new InputsInt();
		int [] anum=ins.input(3,0,9);//0���� 9���� 3���Ǽ��� �ߺ����
		ins.prints(anum);
		System.out.println("\n---------------");
		anum=ins.input(3,0,9,false);//0���� 9���� 3���Ǽ��� �ߺ�����
		ins.prints(anum);
		System.exit(1);
	}
}
