package kr.co.infopub.chap008.test;

import kr.co.infopub.chap008.SansuInterface;
//interface ���
public class SansuInterfaceMain 
         implements SansuInterface {
	public static void main(String[] args) {
		int man=MAN;
		switch(man){
			case 1: System.out.println("����");break;
			case 2: System.out.println("����");break;
		}
	}
}
