package kr.co.programmers.lv2.prt011;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		
		int[] p1 = { 2, 1, 3, 2 };
		int lo1 = 2; // ����°��� �� (0 ����)

	    int rtn1 = p.solution( p1 , lo1);
	    System.out.println( "[1] > " + rtn1 );
	    
		int[] p2 = { 1, 1, 9, 1, 1, 1 };
		int lo2 = 0; // ù��°��� �� (0 ����)

	    int rtn2 = p.solution( p2 , lo2);
	    System.out.println( "[2] > " + rtn2 );
	    
	}

	public int solution(int[] priorities, int location) {

		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		
		int loca = location; // ���� ��ġ
		for (int i=0; i<priorities.length; i++) {
			q.offer(priorities[i]); // ť�� ����
		}
		
		//Iterator<Integer> iterator = q.iterator();
		
		int tmp_i = 0;
		int cnt = 0;
		while ( ! q.isEmpty() ) {
			
			tmp_i = q.poll();
			System.out.println(">" + tmp_i + " / " + loca );
			Iterator<Integer> it = q.iterator();
			boolean chk = true; // �߿䵵 ����
			
			while (it.hasNext()) {
				int tmp_ii = it.next();
				
				if (tmp_i <  tmp_ii) {
					chk = false; // ť�� �߿䵵 ������ �ִٸ� false
					break;
				}
			}
			if ( chk ) { //ť�� �߿䵵 ������ ���ٴ� ..
				// ���⼭ �μⰡ �ȴٴ� 
				//loca--;
				cnt++;
				if (loca == 0) {
					// �� ��� ����
					break;
				}
				
				
			} else {
				q.offer(tmp_i);
				//System.out.println(">>");
				if (loca == 0) {
					// �� ��� �����ε� �з��� ���
					loca = q.size();
				}
			}
			loca--;
		}
		answer = cnt;
        return answer;
	}
}
