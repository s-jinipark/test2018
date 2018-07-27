package kr.co.infopub.chap076;
public class ArrayCloneCopys {

	public static void main(String[] args) {
		int [] a={8,5,2,4,6,3,7,9};
		int [] b={8,5,2,4,6,3,7,9};
		int [] c=a;    //shallow copy
		int [] d=new int[b.length];
		System.arraycopy(b,0,d,0,b.length);//deep copy
		//clone�� �������� ������ CloneNotSupportedException �߻�
		int [] e=(int [])b.clone();
		print(e);
		b[4]=-2;
		print(e); //[2] clone ���� ��������Ƿ�, b �� ���� �ٲپ ���� ����
		
		System.out.println("--------------------");
		int [][] fa={{4,5,6,7},{6,7,8,9}};
		int [][] fb=(int[][])fa.clone();
		fa[0][0]=-1;
		print(fb);//1���� �迭 clone-> deep copy **
		          //2���� �迭 clone-> shallow copy
		//2���� �迭�� deep copy ��Ű�� ���ؼ� 
		int [][] fc=new int[fa.length][fa[0].length];
		for(int i=0;i<fa.length;i++){
			fc[i]=(int [])fa[i].clone();
		}
		fa[0][0]=-5;
		print(fc);//fc�� fa��ȭ�� ������ ���� �ʴ´�.
	}
	public static void print(int [] p){
		for(int i=0;i<p.length;i++){      
			System.out.print("["+p[i]+"] ");
		}
		System.out.println();
	}
	public static void print(int [][] p){
		for(int i=0;i<p.length;i++){
			for(int j=0;j<p[i].length;j++){
				System.out.print("["+p[i][j]+"] ");
			}
			System.out.println();
		}
	}
}
