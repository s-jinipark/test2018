package kr.co.infopub.chap018;
public class  ForTest1Main
{
	public static void main(String[] args) 
	{
		for(int j=40;j<50;j++){
			System.out.print(j+" ");
			//System.out.printf("%d ",j);
		}
		System.out.println();//�� �� �̵�
		//System.out.printf("%n");
		
		int i=0; //i�� ����??
		for(; i<9;i++){
			System.out.print(i+" ");
		}
		System.out.println("\ni�� ���� :"+i);
	}
}
