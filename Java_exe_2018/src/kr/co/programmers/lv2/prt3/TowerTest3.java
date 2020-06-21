package kr.co.programmers.lv2.prt3;

import java.util.Stack;

public class TowerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerTest3 t = new TowerTest3();
		
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
		// ���α׷��ӽ� �ٸ� ��� Ǯ��
		int[] answer = new int[heights.length];
		Stack<Tower> st = new Stack<>();
		
		for (int i=0; i< heights.length ; i++) {
			Tower tower = new Tower(i+1, heights[i]);
			int receiveIdx = 0;
			
			while (!st.isEmpty() ) { // ������ ��� ���� �ʴٸ�
				Tower top = st.peek();
				
				if (top.height > tower.height ) { // ���ÿ� �ִ°� �� ũ��
					receiveIdx = top.idx;
					break; // break �̹Ƿ� pop() �� ��
				}
				st.pop(); // ����
				
			}
			
			st.push(tower);
			answer[i] = receiveIdx;
			
		}
		
        return answer;
    }
    
}
class  Tower{
	int idx;
	int height;
	
	public Tower(int idx, int height) {
		this.idx = idx;
		this.height = height;
	}
}