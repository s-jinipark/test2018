package kr.co.infopub.chap008.test;

import kr.co.infopub.chap008.SansuStatic;

public class SansuStaticMain {
	
	public final static int MEN   = 3;
	public final static int WOMEN = 4;

	public static void main(String[] args) {
		int people1=WOMEN;
		switch(people1){
			case 3: System.out.println("����");break;
			case 4: System.out.println("����");break;
		}
		//int SansuStatic.WOMAN=4; ����� assign ����
		int people2=SansuStatic.WOMAN;
		switch(people2){
			case 1: System.out.println("����");break;
			case 2: System.out.println("����");break;
		}
	}
}
