package kr.co.infopub.chap084;
public class AccountReferencing {
 	public static void main(String[] args) {
 		Account acc1=new Account(1000); //���� ����
 		Account acc2=new Account(1000); //���� ����
 		System.out.println(acc1.hashCode());//10����
 		System.out.println(acc1);
 		System.out.println(acc2);//type@hashCode
 		acc1.deposit(3000);  //����
 		System.out.println(acc1);
 	}
}
