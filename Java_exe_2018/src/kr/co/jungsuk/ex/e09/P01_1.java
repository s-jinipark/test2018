package kr.co.jungsuk.ex.e09;

public class P01_1 {
	// [9-1] ������ ���� �������� �򵵷� SutdaCardŬ������ equals()�� ��������� num,
	// isKwang�� ���� ���ϵ��� �������̵��ϰ� �׽�Ʈ �Ͻÿ�.
	/*
	[������]
			c1=3K
			c2=3K
			c1.equals(c2):true
	*/
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public boolean equals(Object obj) {
		/*
		(1) �Ű������� �Ѱ��� ��ü�� num, isKwang��
		������� num, isKwang�� ���ϵ��� �������̵� �Ͻÿ�.
		*/
		int p_num = ( (SutdaCard)obj).num ;
		boolean p_isKwang = ( (SutdaCard)obj).isKwang ;
		
		boolean rtn_val = false;
		
		if (p_num == this.num) {
			if (p_isKwang == this.isKwang) {
				rtn_val = true;
			} 
		}
		return rtn_val;
		
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}