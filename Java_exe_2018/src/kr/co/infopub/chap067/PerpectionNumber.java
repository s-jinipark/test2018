package kr.co.infopub.chap067;
public class PerpectionNumber{

	public static void main(String[] args) {
		int iters=1000;
		//���1
		for(int i=2;i<iters;i++){
			if(Divisor.divisorSum(i)==i){
				System.out.println("������ "+i);
				Divisor.printDivisor(i);
			}
		}
		//���2
		for(int i=2;i<iters;i++){
			printPerfection(i);
		}
		//���3
		for(int i=2;i<iters;i++){
			if(divisorSum2(i)==(i*2)){
				System.out.println("������ "+i);
				Divisor.printDivisor(i);
			}
		}
	}
	public static void printPerfection(int n){
		if(Divisor.divisorSum(n)==n){
			System.out.println("������ "+n);
			Divisor.printDivisor(n);
		}
	}
	// ����� ���� ���ϴ� �޼��� �ڱ� �ڽ� ����
    public static int divisorSum2(int a){
    	int sum=1;
		for(int j=2;j<=a;j++){
			if(Divisor.isMod(a,j)){//Divisor Ŭ����
				sum+=j;
			}
		}
		return sum;
    }
}
