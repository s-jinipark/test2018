package kr.co.programmers.lv2.prt3;

import java.util.Stack;

public class TowerTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerTest4 t = new TowerTest4();
		
		int[]  h1 = { 6,9,5,7,4 };
		int[] rtn1 = t.solution( h1 );
		System.out.println("[1] > " + rtn1);
		for (int i=0; i<rtn1.length ; i++) {
			System.out.println(">" + rtn1[i]);
		}
		int[]  h2 = { 3,9,9,3,5,7,2 };
		int[] rtn2 = t.solution( h2 );
		System.out.println("[2] > " + rtn2);
	}

	public int[] solution(int[] heights) {
		//int[] answer = {};

		int[] answer = new int[heights.length];

		// �ٽ� Ǯ�
		Stack<Tower> st = new Stack<>();
		
		for (int i=0 ; i<heights.length ; i++) {
			// ������� ���� 
			// �������� �������� �߻�
			// ������ �ִ°� �۴� => ������
			// ������ �ִ��� ũ�� -> ū idx �� answer �� ����, ���ÿ� push
			Tower tower = new Tower (i+1, heights[i]);  //  1���� ����
			int prev_idx = 0;
			
			while (!st.isEmpty()) { // ť�� ������� ���� �� ����
				Tower top = st.peek();
				
				if (top.height > tower.height) {
					prev_idx = top.idx;
					break;
				} else {
					st.pop(); //����
				}
				
			}
			
			st.push(tower);
			answer[i] = prev_idx;
		}
		
        return answer;
    }
    
}
