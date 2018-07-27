package kr.co.infopub.chap168.test;
import java.util.*;

import kr.co.infopub.chap168.Card;
import kr.co.infopub.chap168.CardGenVectorBox;
import kr.co.infopub.chap168.CardPoint;
public class  CardPointGenMain{//JAVA5~7
	public static void main(String[] args) 
	{
		CardGenVectorBox box = new CardGenVectorBox();
		Vector<Card> cards=box.getAllCards();
		CardPoint cp=new CardPoint(cards.get(0),cards.get(2));
		CardPoint cp2=new CardPoint(cards.get(1),cards.get(3));

		if(cp.getPoint()>cp2.getPoint()){
			System.out.println(cp+" Win!!!  "+cp2+" Lose!!");
		}else if(cp.getPoint()<cp2.getPoint()){
			System.out.println(cp2+" Win!!!  "+cp+" Lose!!");
		}else{
			System.out.println(cp+" = "+cp2);
		}
	}
}
