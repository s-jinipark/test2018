package kr.co.infopub.chap076;
public class ArrayCloneCopys_100 {

	public static void main(String[] args) {
		int [] a={8,5,2,4,6,3,7,9};
		//int [] b={8,5,2,4,6,3,7,9};
		int [] c=a;    //shallow copy
		int [] d=new int[a.length];
		System.arraycopy(a,0,d,0,a.length);//deep copy
		//clone�� �������� ������ CloneNotSupportedException �߻�
		int [] e=(int [])a.clone();
		a[4]=-2;
		System.out.println("----- a �μ�");
		print(a);
		System.out.println("----- c �μ�");
		print(c);
		System.out.println("----- d �μ�");
		print(d);
		System.out.println("----- e �μ�");
		print(e); //[2] d, e �� ���� ����

		System.out.println("--------------------");
		int [][] fa={{4,5,6,7},{6,7,8,9}};
		int [][] fb=(int[][])fa.clone();
		fa[0][0]=-1;
		System.out.println("----- fb �μ�");
		print(fb);//1���� �迭 clone-> deep copy **
		          //2���� �迭 clone-> shallow copy
		//2���� �迭�� deep copy ��Ű�� ���ؼ� 
		int [][] fc=new int[fa.length][fa[0].length];
		
		for(int i=0;i<fa.length;i++){
			fc[i]=(int [])fa[i].clone(); //[2] 1���� �迭���� clone
			// �� fc[0], fc[1] ���� .clone()
		}
		
		fa[0][0]=-5;
		System.out.println("----- fc �μ�");
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
