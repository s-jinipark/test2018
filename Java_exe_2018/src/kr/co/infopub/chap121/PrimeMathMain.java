package kr.co.infopub.chap121;
public class PrimeMathMain {

	public static void main(String[] args) {
		
		PrimeMath pm=new PrimeMath();
		
		pm.printPrime(pm.commonDividors(100));
		System.out.println("----------------------------------");
		System.out.println(" 7880599�� �ڼ��ΰ�? "+pm.isPri(7880599));

		for(int i=1;i<=100;i++){
			System.out.print(i+" : ");pm.printPrime(pm.commonDividors(i));
		}//
		
		System.out.println("\n������� ���ϰ� �Ҽ����ϱ�");
		for(int i=1;i<=100;i++){
			if(pm.divisors(i)==2){
				System.out.println(i+":�� ����� ������ 2��: �Ҽ� ");
			}
			
		}//
	}
}
