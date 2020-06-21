package kr.co.programmers.lv2.prt6;

import java.util.LinkedList;
import java.util.Queue;
public class Truck_Passing_Bridge4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck_Passing_Bridge4 tpb = new Truck_Passing_Bridge4();
		
		int bl1 = 2;
		int w1 = 10;
		int[] tw1 = { 7,4,5,6 };

//		int bl1 = 100;
//		int w1 = 100;
//		int[] tw1 = { 10 };

//		int bl1 = 100;
//		int w1 = 100;
//		int[] tw1 = { 10,10,10,10,10,10,10,10,10,10 };
		
		int rtn1 = tpb.solution( bl1,  w1,  tw1);
		System.out.println("[1] > " + rtn1);

		
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		// ���� �õ�
		// ť 2�� ���� : �ǳʴ� ��, ����ϴ� �� 
		// Truck �� ���� ����� �� class ����
		Queue<Truck> going_q = new LinkedList<Truck>();
		Queue<Truck> waiting_q = new LinkedList<Truck>();
		
		// waiting �� ����
		for (int i=0 ; i<truck_weights.length ; i++ ) {
			waiting_q.offer(new Truck(truck_weights[i], 0) );
		}
		//System.out.println("->" + waiting_q);
		// Ʈ���� �� ���� cnt �ϱ⵵ ������
		// going_q �� waiting_q �� ��� ����� �� ����
		int time =0;
		int totalWeight = 0;
		while (!going_q.isEmpty() || !waiting_q.isEmpty() ) {
			time++; // �ð��� �帧 (�������� ���� 1��?)
			
			// �ߵ� �� �ִ� ���� ���� �־� �ش�
			// ���⼭ while �� ���� ������
			// 1�ʿ�  1�� �����̰� (�������� �ڼ��� �� �������� �Ѵ� ��) 
			if (!waiting_q.isEmpty() ) {
				//Truck tmp_truck = waiting_q.peek();
				if ( waiting_q.peek().weight + totalWeight <= weight ) {
					// ���԰� ������ �̸� waiting ���� ���� going �� �־� �ش�
					Truck tmp_truck = waiting_q.poll();
					totalWeight += tmp_truck.weight;
					going_q.offer(new Truck(tmp_truck.weight, time));
				}
			}
			
			// going ���� �����ϴ� ���μ����� ...
			if (!going_q.isEmpty() ) {
				// ���� �ð��� ������ �ð���  ���̰� bridge_length �̸� ť���� ����
				// ���⵵ 2�밡 �������� ���� (���� ����.. �ϳ����̹Ƿ�)
				if (time - going_q.peek().enterTime >= bridge_length) {
					// ť���� �����ϰ� �� ���Կ��� ����
					Truck tmp_truck = going_q.poll();
					totalWeight -= tmp_truck.weight;
					
					
				}
				
			}
			
			// ���� �ٲٴ� ��� �� �޶� �� .. ��
//			if (!waiting_q.isEmpty() ) {
//				//Truck tmp_truck = waiting_q.peek();
//				if ( waiting_q.peek().weight + totalWeight <= weight ) {
//					// ���԰� ������ �̸� waiting ���� ���� going �� �־� �ش�
//					Truck tmp_truck = waiting_q.poll();
//					totalWeight += tmp_truck.weight;
//					going_q.offer(new Truck(tmp_truck.weight, time));
//				}
//			}
			
		}
		answer = time;
        return answer;
    }

}

