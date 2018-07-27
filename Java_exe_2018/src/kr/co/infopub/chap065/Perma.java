package kr.co.infopub.chap065;
public class Perma {

	public static void main(String[] args) {
	  int count=0,powers=3;
	  //x^n+y^n=z^n�� n>2,x,y,x>1 ������Ű�� //���� x,y,z,n�� �������� �ʴ´�.
	  for(int z=2;z<50;z++){
		  for(int y=2;y<50;y++){
			  for(int x=2;x<50;x++){
				  if((int)Math.pow(z,powers)==
				     (int)Math.pow(x,powers)+(int)Math.pow(y,powers)){
				  	  count++;
					  System.out.println("�丣�� �� :x="+x+" y="+y+" z="+z);
				  }
			  }
		  }
		System.out.println(z+"^"+powers+"="+(int)Math.pow(z,powers));
	  }
	  if(count==0){
		System.out.println("�������� �ʽ��ϴ�.");
	  }
	  printPerma(50, 3);
	  for(int i=3;i<6;i++){//3�� ~ 5�±��� Ȯ��
	  	 printPerma(10, i);
	  }
	}//
	public static int pows(int m, int n){
		return (int)Math.pow(m,n);
	}
	public static boolean isPerma(int power, int x, int y, int z){
		return (pows(x, power)==pows(y,power)+pows(z,power));
	}
	public static void printPerma(int n, int powers){
	  int count=0;
	  for(int z=2;z<n;z++){
		  for(int y=2;y<n;y++){
			  for(int x=2;x<n;x++){
				  if(isPerma(powers,z,y,x)){
				  	  count++;
					  System.out.println("�丣�� �� :x="+x+" y="+y+" z="+z);
				  }
			  }
		  }
		System.out.println(z+"^"+powers+"="+(int)Math.pow(z,powers));
	  }
	  if(count==0){
		System.out.println("�������� �ʽ��ϴ�.");
	  }
	}
}
