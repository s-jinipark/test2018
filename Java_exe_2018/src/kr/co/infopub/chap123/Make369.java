package kr.co.infopub.chap123;
public class Make369 {
	private int number369(int number){ // ���ڿ� 3,6,9 �� �� �� ���ԵǾ� �ִ��� ����
		int a=0;
		int num=0;
		a=number;
		for(int i=0;i<length(number);i++){
			if((a%10)!=0 && (a%10)%3==0){//0�� �ƴϸ鼭 3,6,9
				// �ڸ��� 3,6,9 �� 3 �� ���(3%3=0, 6%3=0, 9%3=0)
				// �׷��� 0%3 �� 0 �� �ǹǷ� �� �ڸ����� 0 �� ����
				num++;
			}
			a=a/10;
		}
		return num;
	}//
	private int length(int nums){
		return (nums+"").length();
	}//
	public void play369(int max){
		for(int i=1;i<=max;i++){
			if(number369(i)>0){
				for(int j=1;j<=number369(i);j++){
					System.out.print("*");
				}
				System.out.print("\t");
			}else{
				System.out.print(i+"\t");
			}
			if(i%10==0){
				System.out.println();
			}
		}
	}//
}

/**
 * 3�� ����� ���ϴ� ���� �ƴ϶� </br>
 * 3, 6, 9�� � ���ԵǾ� �ִ� ���� ���ϴ� ���α׷� </br>
 */
