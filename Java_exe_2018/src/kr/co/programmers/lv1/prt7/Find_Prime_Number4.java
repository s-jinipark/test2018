package kr.co.programmers.lv1.prt7;

import java.util.ArrayList;

public class Find_Prime_Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Prime_Number4 fpn = new Find_Prime_Number4();
		int n1 = 10;
		int rtn1 = 0;
		rtn1 = fpn.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 5;
		int rtn2 = 0;
		rtn2 = fpn.solution( n2 );
		System.out.println("[2] > " + rtn2);
		
	}
	
	public int solution(int n) {
		int answer = 0;
		int tot = 0;
		// ArrayList �� ����
		ArrayList<Boolean> primeList = new ArrayList<>(n+1);
		
		//0 �� °�� 1��°�� �Ҽ� �ƴ����� ó��
		primeList.add(false);
		primeList.add(false);
		
		// 2 ~ n ���� �Ҽ��� ����
		for (int i=2 ; i <= n; i++) {
			primeList.add(i, true);
		}	
		
		// 2 ���� ~ i*i <=n
		// ������ ������� ��������
		for (int i=2 ; (i*i) <= n; i++) {
			if (primeList.get(i) ) {
				for (int j= i*i; j <= n ; j+=i) {
					primeList.set(j,false);
				}
			}
		}
		
		// ���
		for (int i = 2; i <=n; i++ ) {
			if(primeList.get(i) == true){
				System.out.print(" " + i);
				tot++;
			}	
		}
		System.out.println();	
		answer = tot;
		return answer;
	}
	// => ���� ����. �ð� �ʰ�
}
