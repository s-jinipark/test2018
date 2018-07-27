package kr.co.infopub.chap077;

public class ArrayMethodMain {

	public static void main(String[] args) {

		int a=5;
		int b=6;
		ArrayMethod.copyVInt(a,b);//call by value  //immutable
		   						  // �Լ� ���ο��� b=a ������
		System.out.println(a); //������� �ʴ���.
		System.out.println(b); //������� �ʴ���.
		ArrayMethod.multi(a);  //call by value  //immutable
			  				   // �Լ� ���ο��� *10 ������
		System.out.println(a);//������� �ʴ���.
		
		System.out.println("--------------------");
		
		int [] aa={5,4,7,1,9,12,0,3,2,6};
		int [] bb=new int[aa.length];
		int [] cc={5,4,7,1,9,12,0,3,2,6};
		int [] dd=new int[cc.length];
		
		ArrayMethod.copyR(aa,bb);  //call by reference�� copy
								   //[2] �Լ����ο��� bb=aa
		ArrayMethod.print(bb);
		ArrayMethod.copyRChange(aa,bb);
		                           //[2] �Լ����ο��� bb=aa, bb[0] ����
		ArrayMethod.print(bb);
		ArrayMethod.print(aa);
		
		System.out.println("--------------------");
		ArrayMethod.bbsort(aa);  //call by reference�� sorting  //mutable
		ArrayMethod.print(aa);  
		
		ArrayMethod.copyV(cc,dd);  //dd�� ������ ��� 0�̾���. 
		ArrayMethod.print(dd); //call by value�� copy  //mutable
	}
}
