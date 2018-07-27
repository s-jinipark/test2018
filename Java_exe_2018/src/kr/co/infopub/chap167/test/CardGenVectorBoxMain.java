package kr.co.infopub.chap167.test;
import java.util.*;

import kr.co.infopub.chap167.Card;
import kr.co.infopub.chap167.CardGenVectorBox;
public class CardGenVectorBoxMain
{
	public static void main(String[] args) 
	{
		CardGenVectorBox box =new CardGenVectorBox();
		Vector<Card> cards =box.getAllCards();
		println(cards);
		System.out.printf("%n-----------------%n");
		box.shuffles();//ī�弯��
		cards=box.getAllCards();
		println(cards);
	}
	public static void println(Vector<Card> cards){
		for(int i=0;i<cards.size();i++){
			System.out.printf("%s",cards.get(i));
			if((i+1)%10==0){
				System.out.printf("%n");
			}
		}
	}
}
