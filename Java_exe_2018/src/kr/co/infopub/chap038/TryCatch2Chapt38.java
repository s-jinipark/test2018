package kr.co.infopub.chap038;
public class TryCatch2Chapt38 {

	public static void main(String[] args) {
		
		String sNum="123";
		String nNum="h";
		try{
			int a=Integer.parseInt(nNum);
			System.out.println(a);
		}catch(Exception ee){
			System.out.println("==> ���� !!!!");
			System.err.println(ee+"<==");
		}finally{
			System.out.println("�� ����Ǿ�� �� ��!!!!");
		}

		try {
			// Divide by zero.
			int x = 5;
			int y = 20 / (5 - x);
		} catch (ArithmeticException e) {//run time
		   System.out.println("==> 0���� ������ Ȯ���� ��!!!!");
		   e.printStackTrace();
		}
	}
}
