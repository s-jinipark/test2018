package kr.co.infopub.chapter.s134;
import kr.co.infopub.chapter.s133.Lotto6Num;
public class JSortMain4 {
	public static void main(String[] args) {
		Lotto6Num lot=new Lotto6Num(1000,100);
		lot.randomMake();        //���� �� �� ���� 100���� ������ �迭 �����
    	int [] m=lot.getLots();  //���� �� �� ���� 100���� ������ �迭 ���
    	int []n=new int[m.length];
		System.arraycopy(m, 0, n, 0, m.length);
		JSort.print(n);
		long a=System.nanoTime();
		JSort.QuickSort(n);
		long b =System.nanoTime();
		System.out.println((b-a)+"nano sec");  // 10�� -9��
		JSort.print(n);
	}
}
