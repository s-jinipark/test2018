package kr.co.infopub.chap028;
public class LogicalOperatorMain {

	public static void main(String[] args) {
		  //1�� �ڸ��� 3�̳� 6�̳� 9�� ��.
		  for(int i=0; i<50; i++){
			  if(((i%10)%3==0) && (i%10!=0)){
				  System.out.print("["+i+"] ");
			  }
		  }
		  System.out.println();
		  //1�� �ڸ��� 3, 6, 9�� �ƴ� ��.
		  for(int i=0; i<50; i++){
			  if(!(((i%10)%3==0) && (i%10!=0))){
				  System.out.print("["+i+"] ");
			  }
			  if((i+1)%10==0){
				  System.out.println();
			  }
		  }
		  System.out.println();
	
		  for(int i=0; i<50; i++){
			  if(((i%10)%3!=0) || (i%10==0)){
				  System.out.print("["+i+"] ");
			  }
			  if((i+1)%10==0){
				  System.out.println();
			  }
		  }
		  
		  System.out.println();
		  //3�� ��� �� 2�� ��� ����
		  for(int j=1, k=30; (k>=10 && j<=30);j++, k--){
			  if( j%3==0 && j%2!=0 ){
				  System.out.print("["+k+","+j+"] ");
				  //System.out.printf("[%d,%d] ",k,j);
			  }
		  }
		  System.out.println();
		  
		  for(int j=1, k=30; (k>=10 && j<=30);j++, k--){
			  if( j%3==0 && j%2!=0 ){
				  System.out.print("["+k+","+j+"] ");
				  //System.out.printf("[%d,%d] ",k,j);
			  }
		  }
		  System.out.println();
	}
}
