package kr.co.infopub.chap167;
import java.util.*;
public class  CardGenVectorBox{	
	private final int numOfCards=
		Card.deck.length*Card.stic.length;//40
	private Vector<Card> vCard;
	public CardGenVectorBox() {	
		make();
	}
	private void make(){
		init();
		fulling();
	}
	private void init(){
		vCard=new Vector<Card>(5,5);
		vCard.clear();
	}
	public void fulling(){
		int count=0;
		while(true){
			Card cd=new Card();// ������ ī�带 �����.
			if(!vCard.contains(cd)){// �������� ���ٸ�
				vCard.add(cd);
				count++;
			}
			if(count==numOfCards){//40
				break;
			}
		}
	}
	public Vector<Card> getAllCards(){
		return vCard;
	}
	public void shuffles(){
		Collections.shuffle(vCard); 
	}
}
