package imsi.challenges.day01;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		//String st = "1927";
		//int in	= 2;	// n �� ����

		String st = "1231234";
		int in	= 3;	
		
		String an = t.solution(st, in);
		
		System.out.println(an);
	}
	
	public String solution(String number, int k) {
		String answer = "";
	
		// �迭�� ���� - ���� - ���� n �� ���� - ū �� ã��
		char[] ch = new char[number.length()];
		
		for (int i = 0; i< number.length() ; i++) {
			ch[i] = number.charAt(i);
		}
		
		Arrays.sort(ch);
		
		StringBuffer sb = new StringBuffer();
		
		for(int j = number.length()-1 ; j>number.length()-1-k; j--) {
			//System.out.println(ch[j]);
			sb.append(ch[j]);
		}
		answer = sb.toString();
		return answer;
    }
	
	// ���������� input ������ ���� ������ ���¿���... => �߸���
	// k �� ������ �����ε�, k ���� ���� => X
}
