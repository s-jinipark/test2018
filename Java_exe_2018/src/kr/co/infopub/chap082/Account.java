package kr.co.infopub.chap082;
public class Account
{
	private double money=500;  // ����� �ʱ� 
   
	public Account ( double money ){ // �����ڿ� ���� �ʱ�
		this.money=money;
	}
	public Account (  ){ // default �����ڿ� ���� �ʱ�
	}
	public double getMoney(){  //���� �ܱ�
		return money;
	}
	// -500���� ���� ���� ���� ����ϰų�,�ܱݺ��� ���� ���� ��� ���ϰ� 
	// �ϸ鼭 ���ϴ� ���� ���
	public void withdraw(double amount){  //���
		if((amount>0)&&(money-amount>=0)){
			money-=amount;
		}
	}
	// -500���� ���� ���� ���� �Ա� ���ϰ�
	// �ϸ鼭 ���ϴ� ���� �Ա�	
	public void deposit(double amount){  //�Ա�
		if(amount>0){
			money+=amount;
		}
	}
}
