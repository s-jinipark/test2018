package kr.co.programmers.lv2.prt33;

import java.util.ArrayList;
import java.util.Collections;

public class Jaden_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jaden_Case jc = new Jaden_Case();
		
		String s1 = "3people unFollowed me";
		
		String rtn1 = jc.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "for the last week";
		
		String rtn2 = jc.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public String solution(String s) {
		String answer = "";

		// �ϴ� �ҹ��ڷ�
		s = s.toLowerCase();
		// �������� �и�
		String[] test = s.split(" ");
		
		for (int i =0; i< test.length; i++ ) {
			test[i] = test[i].substring(0,1).toUpperCase() + test[i].substring(1);
			answer += test[i];
			if (i < test.length-1) {// �������� �ƴ϶��
				answer += " " ;
			}
		}
		
		
		return answer;

    } 
	// ���� 2 �� �̸� �ȵ�
}
