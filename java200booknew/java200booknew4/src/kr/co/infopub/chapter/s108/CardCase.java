package kr.co.infopub.chapter.s108;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	int suit=CardUtil.SUIT.length; // 0~3
	int valu=CardUtil.VALU.length; // 0~12
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
 // CardComp Ŭ������ ����.
 public void sort(){
	Comparator<Card> cmp=new Comparator<Card>() {
		@Override
		public int compare (Card c1, Card c2) {
			return c1.getCardVal().compareTo(c2.getCardVal());
		}
	};
	cards.sort(cmp); 
 }
 // CardRomp Ŭ������ ����.
 public void rsort(){
	// �͸� -anonymous 
	cards.sort(new Comparator<Card>() {
		@Override
		public int compare (Card c1, Card c2) {
			return - c1.getCardVal().compareTo(c2.getCardVal());
		}
	});
}
 // sort�� lambda�� ����
 public void lambdasort(){
	cards.sort((c1, c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());});
 }
 public void lambdasort2(){
	cards.sort(Comparator.comparing(Card::getCardVal)); // comparing
 }
 public void lambdasort3(){
	cards.sort(Card::compareCard);  // static 
 }
 // rsort�� lambda�� ����
 public void lambdarsort(){
	cards.sort(
	(c1, c2) ->{return - c1.getCardVal().compareTo(c2.getCardVal());});
 }
 public void lambdarsort2(){
	Comparator<Card> mycard = (c1, c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());};
	cards.sort( mycard.reversed() );
 }
 public void rambdarsort3(){
	cards.sort(Card::compareRCard);  //static 
 }
}


/*
Comparator<Card> cmp=new Comparator<Card>() {
	@Override
	public int compare (Card c1, Card c2) {
		return c1.getCardVal().compareTo(c2.getCardVal());
	}
};
cards.sort(cmp); 
*/