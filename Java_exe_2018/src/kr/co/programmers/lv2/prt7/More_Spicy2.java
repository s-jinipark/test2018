package kr.co.programmers.lv2.prt7;

import java.util.ArrayList;
import java.util.Collections;

public class More_Spicy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		More_Spicy2 ms = new More_Spicy2();
		
		int[] s1 = { 1, 2, 3, 9, 10, 12	};
		int k1 = 7;

		int rtn1 = ms.solution( s1,  k1);
		System.out.println("[1] > " + rtn1);

	}

	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        boolean test_b = true;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i =0; i< scoville.length; i++ ) {
    		//System.out.println(">" + scoville[i]);	
        	if ( scoville[i] < K) { // ��� ����
        		al.add( scoville[i] ); 
        	}
    	}
        
        int cnt = 0;
        while ( test_b ) {
            int tmp1 = 0;
            int tmp2 = 0;
            int tmp_new = 0;
         	// sort
            Collections.sort(al);
        	if (al.size() < 2) {
        		break;
        	} else {
        		tmp1 = al.get(0);
        		tmp2 = al.get(1);
        	}
            System.out.println(">>" + al.size());
            
            if ( tmp1 < K && tmp2 < K ) {
            	//���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
            	tmp_new = tmp1 + (tmp2 * 2);
            	//al.add(tmp_new);
            	// �ٽ� ���� �ʿ䰡 ����
            	// �ƴ� K ���� ������ �ٽ� �־� �ش�
            	if (tmp_new < K ) al.add(tmp_new);
            	al.remove(1);
            	al.remove(0);	// 0 -> 1 ������ ����� ������ 
            	cnt++;

            } else if (tmp1 < K || tmp2 > K){
            	// �ϳ��� ���� ���
            	cnt = -1;
            	test_b = false;
            	
            } else {
            	test_b = false;
            }
            
        }
        
        answer = cnt;
        return answer;
    }
    // ���� �ð� �ʰ�
}
