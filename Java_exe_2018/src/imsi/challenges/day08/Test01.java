package imsi.challenges.day08;

import java.util.LinkedList;
import java.util.Queue;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
				
		//int[] prior = {2, 1, 3, 2};
		//int loc = 2;
		int[] prior = {1, 1, 9, 1, 1, 1};
		int loc = 0;
		
		int an = t.solution(prior, loc);
		
		System.out.println(an);

	}
	
	public int solution(int[] priorites,  int location) {
		int answer = 0;
		int print_order=0;
		// ť ����
		Queue<Integer> que = new LinkedList<Integer>();
		Queue<Integer> que_idx = new LinkedList<Integer>();  // ����
		
		// ����
		for (int i=0; i<priorites.length ; i++) {
			que.add(priorites[i]);
			que_idx.add(i);  // ����
		}
		
        while(!que.isEmpty()) {
        	//������
        	int tmp = que.poll();
        	int tmp_idx = que_idx.poll();
            //System.out.println(">" + tmp );
            
            // �켱 ���� ���� �� �˻�
//    		for(int i = 0; i<que.size(); i++) {
//    			System.out.println(que.peek());
//    		}
            // --> X , �������� loop ���鼭 �˻��ϰ� �;�����
            // ���� �� �ۿ� �� ����
            
            // �׷��� priorites �迭�� �̿�
            boolean print = true;
    		for(int i = 0; i<priorites.length; i++) {
    			if ( tmp < priorites[i] ) {
    				// �ٽ� �ִ´�
    				que.offer(tmp);
    				que_idx.offer(tmp_idx);
    				print = false;
    				break;
    			} 
    		}
            
    		if (print) {
    			//System.out.println(">>" + tmp);
    			priorites[tmp_idx] = -1;
    			print_order++;
    			// ���� �� ������ location �� ��ġ �ϴ��� ?
    			if (location == tmp_idx) {
    				answer = print_order;
    			}
    		}
        }
        
		return answer;
    }


	
}
