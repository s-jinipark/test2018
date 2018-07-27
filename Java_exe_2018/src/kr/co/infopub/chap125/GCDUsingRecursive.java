package kr.co.infopub.chap125;
public class  GCDUsingRecursive
{
    //�ִ� ����� �� Recursive
	public static int gcdR(int m,int n){
		int temp=0;
        prints(m,n);
		if(m==n) temp=m;
		else if(m>n)temp=gcdR(m-n,n);
		else if(m<n)temp=gcdR(m,n-m);
		return temp;
	}
    public static int lcmR(int m,int n){
		return (m*n)/gcdR(m,n);
    }
	//�ִ������� ����ϴ� ���� ���
	public static void prints(int m,int n){
		System.out.println("( "+m+" , "+n+" )");		
	}
}
