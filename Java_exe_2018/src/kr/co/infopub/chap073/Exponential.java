package kr.co.infopub.chap073;
public class  Exponential
{
	public static void main(String[] args) 
	{
		System.out.println(exp(1));//Section 46�� �Ϲݽ�(x)
		System.out.println(cos(60*Math.PI/180.0));//����
	}	
	public static double exp(double x){
		double temp=1;
		double sum=1;
		int count=20;
		for(int i=0;i<count;i++){
			temp*=(x)/(i+1);
			sum+=temp;
		}
		return sum;
	}//
	public static double cos(double x){
		double temp=1;
		double sum=1;
		int count=20;
		int del=1;
		for(int i=0;i<count;i++){
			if((i+1)%4==1 || (i+1)%4==3){
				del=0;
			}else if((i+1)%4==0){
				del=1;
			}else if((i+1)%4==2){
				del=-1;
			}
			temp*=x/(i+1);
			sum+=temp*del;
		}
		return sum;
	}//
	
	//�߰�
	public static double deposit(int month, double a0, double rate){
		double tot=0;
		double a=a0;
		double r=(1+rate/100/12);
		for (int i = 0; i < month; i++) {
			a=a*r;
			tot+=a;
		}
		return tot;
	}
}