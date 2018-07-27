package kr.co.infopub.chap067;
public class Divisor{
	//����ΰ�?
	public static boolean isMod(int a,int b){
	   	boolean isP=false ; // �⺻ ������ �������� �ʴ´�.
	   	if(a!=1 && a!=0 && b!=1 && b!=0 && a%b==0){
			isP=true; //������ ��������.
	   	}
	   	return isP;
    }
    // ����� ���� ���ϴ� �޼��� �ڱ� �ڽ� ����
    public static int divisorSum(int a){
    	int sum=1;
		for(int j=2;j<a;j++){
			if(isMod(a,j)){
				sum+=j;
			}
		}
		return sum;
    }
    //��� ��� ��� 
    public static void printDivisor(int a){
    	System.out.print("[1, ");
    	for(int j=2;j<a;j++){
			if(isMod(a,j)){
				System.out.print(j+", ");
			}
		}
    	System.out.println(a+"]");
    }
}
