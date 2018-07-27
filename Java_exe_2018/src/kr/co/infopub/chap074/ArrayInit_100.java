package kr.co.infopub.chap074;
public class ArrayInit_100 {
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
		//-> Array constants can only be used in initializers
		System.out.print("a[ ] : \t");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	
		int [] d=a; //Shallow copy
		a[4]=55; //a�� ���� ������Ű�� d�� ���� �ٲ��?
		System.out.print("d[ ] : \t");
		for(int i=0;i<a.length;i++){
			System.out.print(d[i]+"\t");
		}
		// d=a �����Ƿ�, a ���� ������Ű�� d�� ���� �ٲ�
		
		System.out.println();
		int [] e=new int[5];
		System.arraycopy(d,0,e,0,d.length);//Deep copy
		d[4]=100;//d�� ���� ������Ű�� e�� ���� �ٲ��?
		System.out.print("e[ ] : \t");		
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+"\t");
		}
		
		boolean[] bb=new boolean[5];
		System.out.println(bb[0]);
		
		//add - d[] Ȯ��
		System.out.print("d[ ] : \t");				
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]+"\t");
		}
		/*
		������ ���� ���� ����
				���� ���۷����� ���� �ȴ�(�ҽ��� ���۷����� �����Ѵ�)
		System.arraycopy
				����Ƽ���̼��� �غ�Ǹ� �ҽ��� ����Ƽ���̼ǿ� �ϴ��� ���� �Ѵ�
		Ŭ��(clone)
				���ο� �迭 ��ü�� ���� ���� �迭�� �ϴ��� ����(����) �Ѵ�.
				�迭�� ������Ʈ�� String �̳� �⺻ Ÿ���̸� �ҽ��� ����Ƽ���̼���
				���� ������ ���� �ʴ� ���ο� ��ü�� �ȴ� **
				�׷���
				���� Ÿ��(String ����) ** �� ���� ���ͺ��� Ư¡ ������ 
				�ҽ��� ���� �ٲ�� ����Ƽ���̼��� ���� �ٲ��
		*/
		System.out.println();
		System.out.println("------------------------------");
		int [] a100 =new int[]{2,5,3,9,8};
		int [] b100 = a100.clone();
		int [] b110 = a100;
		int [] c100 = new int[5];
		System.arraycopy(a100, 0, c100, 0, a100.length);
		//a100 �� �ٲ�
		a100[4] = 1000;
		for(int i=0;i<a100.length;i++){
			System.out.print(a100[i]+"\t" + b100[i]+"\t" + b110[i]+"\t" + c100[i]+"\n" );
		}
	}//
}