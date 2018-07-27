package kr.co.infopub.chap068;
public class Amicables {//ģȭ��

	public static void main(String[] args) {
		int iters=500, to=200;
		printDivisor(220);
		printDivisor(284);
		System.out.println(divisorSum(220));
		System.out.println(divisorSum(284));

		for(int i=to;i<iters;i++){
			for(int j=to;j<iters;j++){
				if((i!=j) && (j==divisorSum(i) && i==divisorSum(j))){
					System.out.println("ģȭ�� "+i+" : "+j);
				}
			}
		}
		System.out.println("-------------------------------");
	}
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
    public static void printDivisor(int a){
    	System.out.print("[1, ");
    	for(int j=2;j<a;j++){
			if(isMod(a,j)){
				System.out.print(j+", ");
			}
		}
    	System.out.println(a+"]");
    }
    
    //�߰� 
    public static void printAmicable(int stn, int edn){
    	for (int i = stn; i <= edn; i++) {
    		int a=i;
    		int b=divisorSum(a);
			int c=divisorSum(b);
			if(a< b && a==c){
				System.out.printf("(%d, %d)\n",a,b);
				printDivisor(a);
				printDivisor(b);
			}
		}
    }
}
