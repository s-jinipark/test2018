package kr.co.infopub.chap124;
public class  GCDUsingWhile
{
  //�ִ� ����� ��
  public  int gcd(int m,int n){
	  int temp=0;
	  while(m!=n){
		  if(m>n)m-=n;
		  else if(n>m)n-=m;
	  }
	  return m;
  }
  //�ּ� ����� ��
  public  int lcm(int m,int n){
	  return (m*n)/gcd(m,n);
  }
	/*
	�ִ�����(G) �� �ּҰ����(L) ���ϴ� ����
	G : ���� ��� �� ���� ū ��
	L : ���� ��� �� ���� ���� ��
	
	15 �� ����� [1,3,5,15]
	80 �� ����� [1,2,4,5,8,10,16,20,40,80] �̴�
	15 �� 80 �� �������� [1,5] �̰� 5 �� ���� ũ��
	
	15 �� ����� [15,30,45, ..., 240, 255, ... ] �̰�
	80 �� ����� [80, 160, 240, ... ] �̴�
	���� ����� [240, 480, ...] �̸� �ּ� �� 240
	
	��Ŭ���� ȣ����
	�μ��� �Է��Ͽ� ���� ���� �� ������ ū������ �������� ����
	(15,80) -> (15,65) -> (15,50) -> ... (5, 5) : �ִ������� 5
	�ּҰ������ �� ���� ���� �ִ������� ������ �ȴ�
	*/  
}