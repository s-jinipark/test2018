package kr.co.infopub.chap018;
public class  ForTest2Main
{
	public static void main(String[] args) 
	{
		int i=0;  // i�� ������ ���⼭
		for(   ;   ;   ){
			System.out.print(i+"=>");
			i++;
			if(i==10){ break;}
		}
		System.out.println();
		
		for(int j=0;j<10;j++){
			System.out.print(j+"<=");
		}
		System.out.println();


		System.out.println("  ���� i�� ����� �� ����    i= "+i);

		for(int k=0,m=1;k<4 ||  m<2;k++,m++){ 
			System.out.println(k+"  <===k    m===> "+m);
		}
		//i�� �������
	}
}
