package kr.co.infopub.chapter.s113;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
public class CardCase {
	// aggregation : CardCase�� Card�� �����ȴ�.
 private List<Card> cards=new ArrayList<Card>();
 public CardCase() {
	cards.clear(); // ���� �����
 }
 public List<Card> getCards() {
	return cards;
 }
 public int count(){
	return cards.size(); // ����� Card ����
 }
 public Card getCard(int index){
	return cards.get(index);  // index��° Card
 }
 public void make(){
	cards.clear(); // ���� �����
	int deck=CardUtil.SUIT.length; // 0~3
	int suit=CardUtil.VALU.length; // 0~12
	int count=0;
	//���� �ٸ� 20���� ī�带 �����.
	while(count!=deck*suit){    // 20���� �ɶ�����
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
/* public void print(){
	int valu=CardUtil.VALU.length;
	for (int i = 0; i < cards.size(); i++) {
		Card c=cards.get(i);
		System.out.printf("%s ",c.toString());
		if((i+1)%valu==0){
			System.out.println();
		}
	}
 }*/
 public void print(){
	int suit=CardUtil.VALU.length;
	IntStream.range(0, cards.size())
	  .forEach(
		i ->{ System.out.printf("%s ",cards.get(i).toString());
			  if((i+1)%suit==0){System.out.println();} 
	        }
	    );
 }
 // CardComp Ŭ������ ����.
 public void sort(){
	cards.sort((c1, c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());});
 }
 // CardRomp Ŭ������ ����.
 public void rsort(){
	cards.sort(
			(c1, c2) ->{return - c1.getCardVal().compareTo(c2.getCardVal());});
 }
}