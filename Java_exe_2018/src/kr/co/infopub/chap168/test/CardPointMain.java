package kr.co.infopub.chap168.test;
import java.util.*;

import kr.co.infopub.chap168.Card;
import kr.co.infopub.chap168.CardPoint;
import kr.co.infopub.chap168.CardVectorBox;
public class  CardPointMain{
	public static void main(String[] args) 
	{
		CardVectorBox box = new CardVectorBox();
		Vector<Card> cards=box.getAllCards();
		CardPoint cp=new CardPoint((Card)cards.get(0),
			                      (Card)cards.get(2));
		CardPoint cp2=new CardPoint((Card)cards.get(1),
			                      (Card)cards.get(3));
		System.out.println(cp);
		System.out.println(cp.getPoint());//��������
		System.out.println(cp2);
		System.out.println(cp2.getPoint());//��������
		if(cp.getPoint()>cp2.getPoint()){
			System.out.println(cp+" Win!!!  "+cp2+" Lose!!");
		}else if(cp.getPoint()<cp2.getPoint()){
			System.out.println(cp2+" Win!!!  "+cp+" Lose!!");
		}else{
			System.out.println(cp+" = "+cp2);
		}
	}
}
