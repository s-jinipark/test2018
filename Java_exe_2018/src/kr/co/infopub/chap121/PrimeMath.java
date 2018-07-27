package kr.co.infopub.chap121;
public class PrimeMath {
   public PrimeMath(){}
   //�μ��� �޾Ƽ� ������ �������� ���� Ȯ��.
   public boolean isMod(int a,int b){
   	boolean isP=false ; // �⺻ ������ �������� �ʴ´�.
   	if( b!=0 && a%b==0){
		isP=true; //������ ��������.
   	}
   	return isP;
   }
   //�ڼ����� Ȯ���ϴ� �޼���
   public boolean isPri(int a){
	boolean isP=true ;
	int b=(int)Math.sqrt(a);//50�̸� 2���� 7������ ������ ������. 
	for(int i=2;i<=b;i++){
		if(isMod(a,i)){     //(50,2) (50,3) (50,4) .....
			isP=false;
			break;   //forŻ��  //(50,2) |�Ҽ��� �ƴϴ�. 
		}else isP=true;
	}
	return isP;
   }
	//����� ������ ���ϴ� �޼���
   public int divisors(int a){
   	int count=1;
	for(int j=2;j<=a;j++){
		if(isMod(a,j)){
			count++;
		}
	}
	return count;
   }
   //����� ���ϴ� �޼���
   public int[] commonDividors(int a){
   	int [] b=null;
   	int count=1;   //1�� �ڱ� �ڽ� 
    int num=1;
   	if(a>1){	
		count=divisors(a);  //������� ���ϱ�
		b=new int[count];     //��� ������ŭ �迭 ����
		//System.out.println("count  "+count);
		b[0]=1;
		for(int j=2;j<=a;j++){
				if(isMod(a,j)){   //������ 
					b[num++]=j;   //����� ����
				}
		}	
   	}else if(a==1){
   		b=new int[1];
   		b[0]=1;
   	}	
   	return b;
   }
   //����� ���ϰ� �ϴ� �޼��� 
   public void printPrime(int [] array){
   	int count=array.length;
	System.out.print(count+"��  : [  ");
   	for(int i=0;i<count-1;i++){
   		System.out.print(array[i]+" , ");
   	}
	System.out.print(array[count-1]);
	System.out.println("  ]");
   }//
}
