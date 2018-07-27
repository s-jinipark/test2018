package kr.co.infopub.chap167.test;
import java.util.*;

import kr.co.infopub.chap167.Card;
import kr.co.infopub.chap167.CardVectorBox;
public class CardVectorBoxMain
{
	public static void main(String[] args) 
	{
		CardVectorBox box = new CardVectorBox();
		Vector cards=box.getAllCards();
		println(cards);
		System.out.println("\n-----------------");
		box.shuffles();//ī�弯��
		cards=box.getAllCards();
		println(cards);
	}
	public static void println(Vector cards){
		for(int i=0;i<cards.size();i++){
			System.out.print((Card)cards.get(i));
			if((i+1)%10==0){
				System.out.println();
			}
		}
	}
}
