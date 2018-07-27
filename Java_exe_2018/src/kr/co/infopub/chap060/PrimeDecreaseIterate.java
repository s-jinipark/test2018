package kr.co.infopub.chap060;
public class PrimeDecreaseIterate {

	public static void main(String[] args) {
		int toInt=30;
		for(int i=2;i<toInt;i++){
			printPrime(i,isPrime2(i));
		}//for
		for(int i=2;i<toInt;i++){
			printPrime(i,isPrime3(i));
		}//for
		
		System.out.println(isPrime3(10000873));
	}
	//�ڼ����� Ȯ���ϴ� �޼���
	public static boolean isPrime2(int a){
		boolean isP=true ;
		int b=a/2; //50�̸� 2���� 25������ ������ ������. 
		for(int i=2;i<=b;i++){
			if(a%i==0){        //(50,2) (50,3) (50,4) .....
				isP=false;
				break;   //forŻ��  //(50,2) |�Ҽ��� �ƴϴ�. 
			}else isP=true;
		}
		return isP;
	}
	//�ڼ����� Ȯ���ϴ� �޼���
	public static boolean isPrime3(int a){
		boolean isP=true ;
		int b=(int)Math.sqrt(a);//50�̸� 2���� 7������ ������ ������. 
		for(int i=2;i<=b;i++){
			if(a%i==0){       //(50,2) (50,3) (50,4) .....
				isP=false;
				break;   //forŻ��  //(50,2) |�Ҽ��� �ƴϴ�. 
			}else isP=true;
		}
		return isP;
	}
	public static void printPrime(int num, boolean isp){
		if(isp){
			System.out.println(num+"�� �Ҽ�");
		}
		else{
			System.out.println(num+"�� �Ҽ��� �ƴ�");
		}
	}
}
