package kr.co.infopub.chap074;
public class ArrayInit {
	public static void main(String[] args) {
		//�⺻Ÿ���� �迭 ��� ��� 1 ����
		int [] a;// ����
		//����
		a=new int[5];
		//�ʱ�ȭ
		a[0]=2;	a[1]=5; a[2]=3; a[3]=9;	a[4]=8;
		
		//��� 2 ���� ���� �ʱ�ȭ
		int [] b=new int[]{2,5,3,9,8};
	
		//��� 3 ���� (����)�ʱ�ȭ
		int [] c={2,5,3,9,8};
		//�Ұ� �ٽ� ���� �Ұ�
		//c={2,5,3,9};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	
		int [] d=a; //Shallow copy
		a[4]=55; //a�� ���� ������Ű�� d�� ���� �ٲ��?
		for(int i=0;i<a.length;i++){
			System.out.print(d[i]+"\t");
		}
		System.out.println();
		int [] e=new int[5];
		System.arraycopy(d,0,e,0,d.length);//Deep copy
		d[4]=100;//d�� ���� ������Ű�� e�� ���� �ٲ��?
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+"\t");
		}
		
		boolean[] bb=new boolean[5];
		System.out.println(bb[0]);
	}//
}