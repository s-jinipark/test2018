package kr.co.programmers.lv2.prt6;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_Passing_Bridge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck_Passing_Bridge2 tpb = new Truck_Passing_Bridge2();
		
//		int bl1 = 2;
//		int w1 = 10;
//		int[] tw1 = { 7,4,5,6 };

//		int bl1 = 100;
//		int w1 = 100;
//		int[] tw1 = { 10 };

		int bl1 = 100;
		int w1 = 100;
		int[] tw1 = { 10,10,10,10,10,10,10,10,10,10 };
		
		int rtn1 = tpb.solution( bl1,  w1,  tw1);
		System.out.println("[1] > " + rtn1);

		
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		// ���ͳ� �����ؼ� ����
		int[] endTime = new int[truck_weights.length];
		
		Queue<Integer> onBridge = new LinkedList<Integer>(); // 
		int time = 0;
		int cur = 0;
		while (true) {
			// ������ Ʈ�� ����
			if (!onBridge.isEmpty() && endTime[onBridge.peek()] == time) {
				weight += truck_weights[onBridge.poll()];
			}
			
			// ����ϴ� Ʈ�� �߰�
			if (cur < truck_weights.length && truck_weights[cur] <= weight) {
				onBridge.add(cur);
				endTime[cur] = time + bridge_length;
				weight -= truck_weights[cur] ;
				cur++;
			}
			
			time++;
			if (onBridge.isEmpty()) {
				break;
			}
		}
		answer = time;
		
		// �ι�°  �õ�
		// ���� ���� Ʈ���� ������  queue �� ���� len �� ����� �迭��...
//		Queue<Integer> q1 = new LinkedList<>(); // ���� ��
//		Queue<Integer> q2 = new LinkedList<>(); // length 
//		
//		int[] remained_len = new int[truck_weights.length];
//		
//		boolean flag = true;
//		int cnt = 0; // ����ð�
//		int cur_idx = 0; // ���� ��ġ
//		int tmp_weight = 0; // �ӽ� ���� ��
//		
//		while (flag) {
//			
//			// ���� ��ġ�� weight�� length �� ���� ��
//			while (tmp_weight <= weight) {
//				q1.offer( truck_weights[cur_idx] );
//				remained_len[cur_idx] = bridge_length;
//				tmp_weight += truck_weights[cur_idx];
//			}
//			
//			
//			cnt++;	// ����ð�
//			
//		}
		
		
		
//		boolean procs = true;
//		int time_cnt = 0;
//
//		int tmp_i = 0;
//		int idx = 0;
//		int proc_sum = 0;
//		
//		while (time_cnt <100) {
//			
//			while ( !al1.isEmpty() ) { // ��⿭�� ����� �� ����
//
//				// �ٸ��� �ǳʴ� Ʈ�� ���� �� ���� ��
//				for (int i=0; i<al2.size() ; i++) {
//					proc_sum += al2.get(i);
//				}
//				
//				if ( proc_sum < weight ) { // �ѵ��� ���� �ʾ��� ��� ��⿭���� �̾ƿ�
//					tmp_i = al1.get(idx);
//					al2.add(tmp_i);
//				} else {
//					System.out.println(">>");
//
//					break;
//				}
//				
//			} 
//
//			System.out.println(">" + tmp_i );
//			time_cnt++;
//		}
        return answer;
    }
    // 
		
}
