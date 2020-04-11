package kr.co.infopub.chapter.s106;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CardCase {
	// aggregation : CardCase�� Card�� �����ȴ�.
	private List<Card> cards=new ArrayList<Card>();
	public CardCase() {
		cards.clear(); // ���� �����
	}
	// List ��ȯ
	public List<Card> getCards() {
		return cards;
	}
	// List�� ����� Card�� ����
	public int count(){
		return cards.size(); // ����� Card ����
	}
	// List�� index��° Card
	public Card getCard(int index){
		return cards.get(index);  // index��° Card
	}
	// ���� �ٸ� ī�� 20�� �����
	public void make(){
		cards.clear(); // ���� �����
		int suit=CardUtil.SUIT.length; // 0~1
		int valu=CardUtil.VALU.length; // 0~9
		int count=0;
		//���� �ٸ� 20���� ī�带 �����.
		while(count!=valu*suit){    // 20���� �� ������
			Card c=new Card();      // ������ ī�带 �����
			if(!cards.contains(c)){ // contains -> equals()�� �̿��� ��
				cards.add(c);       // ���� ��ü�� �ƴ϶�� ����
				count++;
			}
		}
	}
	
	public void shuffle(){
		Collections.shuffle(cards); // ī�� ����
	}

	public void print(){
		int valu=CardUtil.VALU.length;
		for (int i = 0; i < cards.size(); i++) {
			Card c=cards.get(i);
			System.out.printf("%s ",c.toString());
			if((i+1)%valu==0){
				System.out.println();
			}
		}
	}
}//
