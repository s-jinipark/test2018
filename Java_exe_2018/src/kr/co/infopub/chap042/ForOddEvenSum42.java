package kr.co.infopub.chap042;
public class ForOddEvenSum42 {

	public static void main(String[] args) {
		
		int toNum=100;
		try{   
			toNum=ScannerInput.readInt();
		}catch(Exception e){
			System.out.println("����: Ÿ��Ȯ�� ���"+e);
			System.exit(1);//���α׷� ��
		}
		int sumOdd=0;
		int sumEven=0;

		sumEven=summEven(1,toNum);
		System.out.println("1 to "+toNum+" even sum "+sumEven);

		sumOdd=summOdd(1,toNum);
		System.out.println("1 to "+toNum+" odd sum "+sumOdd);
	}
	public static int summEven(int start, int end){
		int sumEven=0;
		//¦����
		for( int i=1; i<=end;i++){
			if(i%2!=0){
				continue;
			}
			sumEven+=i;
		}
		return sumEven;
	}
	public static int summOdd(int start, int end){
		int sumOdd=0;
		//¦����
		for( int i=1; i<=end;i++){
			if(i%2==0){
				continue;
			}
			sumOdd+=i;
		}
		return sumOdd;
	}
}
