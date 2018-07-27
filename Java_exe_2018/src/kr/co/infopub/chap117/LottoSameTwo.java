package kr.co.infopub.chap117;
import java.util.Arrays;
public class LottoSameTwo {
	private int n;
	private int[] ball;
	public LottoSameTwo(int n){
		setSame(n);
	}
	public LottoSameTwo(){
		setSame(10);
	}
	public void setSame(int n){
		this.n=n;
		ball=new int[n];
		Arrays.fill(ball, -1);
	}
	public int[] getBall(){
		return ball;
	}
	private int isSame(int [] a, int b){
		int isS=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==b){
				isS++;
			}
		}
		return isS;
	}
	//���ϴ� ���� �迭 ����� 
	public  void make(){
		int count=0;
		while(true){
			// Math.random()  0<=n<1���� �Ǽ�
			int b=(int)(Math.random()*(n/2)); 
			if(isSame(ball,b)<2){
				ball[count++]=b;
			}
			if(count==n){break;}
		}
	}
}
