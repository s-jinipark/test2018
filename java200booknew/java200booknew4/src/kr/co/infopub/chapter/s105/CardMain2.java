package kr.co.infopub.chapter.s105;
public class CardMain2 {
	public static void main(String[] args) {
		Card c1=new Card("H4");               // ������ (String �ƱԸ�Ʈ)
		Card c2=new Card("H4");               // ������ (String �ƱԸ�Ʈ)
        System.out.println(c1.hashCode());    // ���� ���� ���� �ؽ�
        System.out.println(c2.hashCode());    // ���� ���� ���� �ؽ�
        System.out.println(c1.getCardVal());  // ���� ����
        System.out.println(c2.getCardVal());  // ���� ����
        System.out.println(c1.equals(c2));    // hashCode ��- �������̵�- �߿�
        // ���� ���� ���� �� ���� ��ü�� �����ϰ� �ʹٸ� 
        // hashCode(), equals()�� �������̵�����.
	}
}
