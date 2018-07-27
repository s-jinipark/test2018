package kr.co.infopub.chap054;
public class MultipleOf2And3_100 {

	public static void main(String[] args) {
	    //2�Ǵ� 3�� ���
		System.out.println("2�Ǵ� 3�� ���");
		for(int j=1;j<20;j++){
		   if( j%3==0 || j%2==0 ){
			   System.out.print("["+j+"] ");
		   }
	    }
	    System.out.println();
	    //2�� ����� �ƴ� 3�� ���
		System.out.println("2�� ����� �ƴ� 3�� ���");	    
	    for(int j=1;j<50;j++){
		   if( j%3==0 && j%2!=0 ){
			   System.out.print("["+j+"] ");
		   }
	    }
	    System.out.println();

	    //3�Ǵ� 5�� ���
		System.out.println("3�Ǵ� 5�� ���(~100)");	    
	    for(int j=1;j<100;j++){
	    	if( j%3==0 || j%5==0 ){
			   System.out.print("["+j+"] ");
		   }
	    }
	    System.out.println();
	    
	    //3�� ����� �ƴ� 5�� ���
		System.out.println("3�� ����� �ƴ� 5�� ���(~100)");	    
	    for(int j=1;j<100;j++){
		   if( j%5==0 && j%3!=0 ){
			   System.out.print("["+j+"] ");
		   }
	    }
	    System.out.println();
	    
	    //printMultiple(20);
	    //printMulAnNotB(50,3,2);
	    
	    //printMulAnNotB(50,2,3);
	}
	
	public static void printMultiple(int m){
		if(m<1){
			System.out.println("1�̻��� ����� �Է��Ͻÿ�");
			return ;
		}
		for(int j=1;j<m;j++){
		   if( j%3==0 || j%2==0 ){
			   System.out.print("["+j+"] ");
		   }
	    }
	    System.out.println();
	}
	public static void printMulAnNotB(int n,int jj,int kj){
		if(n<1 || jj<=1 || kj<=1 || jj==kj){
			System.out.println("�˸��� ���� �Է��Ͻÿ�");
			return ;
		}
		for(int j=1;j<n;j++){
		   if( j%jj==0 && j%kj!=0 ){
			   System.out.print("["+j+"] ");
		   }
	    }
	    System.out.println();
	}
}
