package kr.co.infopub.chap036;
public class  DoWhileTest2Chapt36
{
	public static void main(String[] args) 
	{
		int m=150;
		int n=330;
		do{
			System.out.print("["+m+","+n+"] ");
			if(m>n)m-=n;
			else if(n>m)n-=m;
		}while(m!=n);
		System.out.println();
		System.out.println("�ִ����� :"+m);
	}
}
