package kr.co.infopub.chap041;
public class ForOneToHundred41 {

	public static void main(String[] args) {
		
		int toNum=100;
		try{   
			toNum=ScannerInput.readInt();
		}catch(Exception e){
			System.out.println("����: Ÿ��Ȯ�� ���"+e);
			System.exit(1);//���α׷� ��
		}
		//main
		int summs=0;
		for(int i=1;i<=toNum;i++){
			summs+=i;
		}
		System.out.println("1 to "+toNum+" summation="+summs);
		
		//�޼��� 1
		int sum=summation(1,toNum);
		System.out.println("1 to "+toNum+" summation="+sum);
		
		//�޼��� 2
		int sum2=summation(toNum);
		System.out.println("1 to "+toNum+" summation="+sum2);
	}

	public static int summation(int start, int end){
		if(start>end ){return -1;}
		int sum=0;
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		return sum;
	}
	public static int summation(int end){
		return summation(1,end);
	}
}
