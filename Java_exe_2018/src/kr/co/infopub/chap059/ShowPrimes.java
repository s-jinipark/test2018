package kr.co.infopub.chap059;
public class ShowPrimes {

	public static void main(String[] args) {
		int toInt=1000;
		for(int i=2;i<toInt;i++){
			boolean isP=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isP=false;
					break;
				}else{
					isP=true;
				}
			}
			if(isP){
				System.out.println(i+"�� �Ҽ�");
			}
			else{
				System.out.println(i+"�� �Ҽ��� �ƴ�");
			}
		}//for
		
		for(int i=2;i<toInt;i++){
			printPrime(i);
		}//for
		
	}//main
	public static boolean isPrime(int num){
		boolean isP=true;
		for(int j=2;j<num;j++){
			if(num%j==0){
				isP=false;
				break;
			}else{
				isP=true;
			}
		}
		return isP;
	}
	public static void printPrime(int num){
		if(isPrime(num)){
			System.out.println(num+"�� �Ҽ�");
		}
		else{
			System.out.println(num+"�� �Ҽ��� �ƴ�");
		}
	}
}
