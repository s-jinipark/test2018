package kr.co.infopub.chap037;
public class DoWhileBreakChapt37 
{
	public static void main(String[] args) 
	{
		int i=0;
		do{
			i++;
			if(i%2==0){//|
				System.out.print("["+i+"] ");
			}else {
				System.out.print("("+i+") ");
			}
			if(i==10){
				break;
			}
		}while(true);
	}
}
