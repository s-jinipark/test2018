package kr.co.infopub.chapter.s104;
public class CardMain {
	public static void main(String[] args) {
		Card c1=new Card("H4");               // ������ (String �ƱԸ�Ʈ)
		Card c2=new Card("H4");               // ������ (String �ƱԸ�Ʈ)
		Card c3=new Card(c1);                 // ���� ������- ������
        System.out.println(c1.hashCode());    // ���� ���� �ٸ� �ؽ�
        System.out.println(c2.hashCode());    // ���� ���� �ٸ� �ؽ�
        System.out.println(c1.getCardVal());  // ���� ����
        System.out.println(c2.getCardVal());  // ���� ����
        System.out.println(c1.equals(c2));    // hashCode ��- �߿�-false
        System.out.println(c1.equals(c3));    // hashCode ��- �߿� -false
        for(int i=0; i<CardUtil.SUIT.length ; i++){         // SUIT 2
        	for (int j = 0; j <CardUtil.VALU.length; j++) { // VALU 10
        		// ���� ���� �� ������ �ؽ� �ڵ�� ����(���� �� ����)�ϴ�.
        		Card c=new Card();             // ���Ƿ� ī�� ����- �⺻ ������()
				System.out.printf("%s\t",c);   // c.toString()
			}
        	System.out.println( );// 10�� ��� �� �� ĭ �Ʒ�
        }
    	// �׽�Ʈ
    	//int ss=(int)(Math.random()*2);
    	//System.out.println(  Math.random()  * 2);
	}
}

/*
L11 : new �� ������ ��ü�� �ؽ��ڵ尡 ���� �� ����
L12 : ���� �����ڴ� ī�尪�� ������ �ؽ��ڵ尡 �ٸ� ��ü�� �����Ѵ�


*/