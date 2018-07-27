package kr.co.infopub.chap104;
public class ArrayOneTwo {
	private int [] a;
	public ArrayOneTwo(int [] a){
		setArray(a);
	}
	public ArrayOneTwo(){}
	public void setArray(int [] a){
		this.a=a;
	}
	public int [][] oneToTwo(int m,int n){
		int [][] aa=null;
		//3*4==> 12
		int dimen1=a.length;
		if(dimen1!=m*n || m*n==0){
			System.out.println("������ �˸��� �ʴ´�.");
			return null;
		}else{
			aa=new int[m][n];//�迭��������
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				aa[i][j]=a[i*n+j];
			}
		}
		return aa;
	}//twoToOne
}
