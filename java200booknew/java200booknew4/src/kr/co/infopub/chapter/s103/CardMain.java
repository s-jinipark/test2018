package kr.co.infopub.chapter.s103;
public class CardMain {
	public static void main(String[] args) {
		String csuit1="H", cvalu1="6";        // suit+value
		String csuit2="H", cvalu2="3";        // suit+value
		// ��ü ����
		Card c1=new Card("H6");               // ������ (String �ƱԸ�Ʈ) H6
		Card c2=new Card(csuit1+cvalu1);      // ������ (String �ƱԸ�Ʈ) H6
		Card c3=new Card();                   // �⺻ ������  H2�� ����
		Card c4=new Card(csuit2+cvalu2);      // ������ (String �ƱԸ�Ʈ) H3
		
		System.out.printf("%s,%s,%s.%s\n",c1,c2,c3,c4);
		System.out.println(c1.equals(c2));    // �ؽ� �ڵ�� �ٸ�
		System.out.println(c1.getCardVal().equals(c2.getCardVal())); //�� ����
		//���� Ÿ���� equals()�� ���ϼ���.
	}
}

/*

L13 : ��� ��ü�� ���� ������ hashCode() �� �ٸ��� ������ false �̴�.
		new Ű����� �ؽ��ڵ�� ���۷����� ��� �ٸ��� �����
		
*/