package kr.co.programmers.lv1.prt1;

import java.util.ArrayList;
import java.util.HashMap;

public class Player_Not_Finished3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player_Not_Finished3 pnf = new Player_Not_Finished3();
		
		String [] participant1 = new String [] { "leo", "kiki", "eden" };	
		String [] completion1 = new String [] { "eden", "kiki" };	
		String rtn1 = "";
		//----------
		String [] participant2 = new String [] { "marina", "josipa", "nikola", "vinko", "filipa" };	
		String [] completion2 = new String [] { "josipa", "filipa", "marina", "nikola" };	
		String rtn2 = "";
		//----------
		String [] participant3 = new String [] { "mislav", "stanko", "mislav", "ana" };	
		String [] completion3 = new String [] { "stanko", "ana", "mislav" };	
		String rtn3 = "";
		//----------
		rtn1 = pnf.solution(participant1, completion1);
		System.out.println("[1] : " + rtn1);
		//----------
		rtn2 = pnf.solution(participant2, completion2);
		System.out.println("[2] : " + rtn2);
		//----------
		rtn3 = pnf.solution(participant3, completion3);
		System.out.println("[3] : " + rtn3);	
	}

	public String solution(String[] participant, String[] completion) {
		// TODO Auto-generated method stub
		String rtn_val = "";
		
		ArrayList<String> p1 = new ArrayList<>();
		ArrayList<String> c1 = new ArrayList<>();

		for (int i =0 ; i<participant.length ; i++) {
			p1.add(participant[i]);
			if (i < participant.length-1) { //c1 �� 1 �� �۴�
				c1.add(completion[i]);
			}
		}
		
		//p1.retainAll(c1); // p1 ���� c1�� ��ġ�� �κи� ����� ������ ����
		

		// p1 ���� c1 �� ���Ե� ��ü�� �����Ѵ�
//		for(int i= p1.size()-1; i >= 0; i--) {
//			if(c1.contains(p1.get(i)))
//				p1.remove(i);
//		}
		
		//rtn_val = p1.toString();
		
		/*
		[1] : [leo]
		[2] : [vinko]
		[3] : []

		3�� ��� [3] : mislav �� ���;� ��
		�� ����� �ߺ��� �Բ� ��������
		*/
		
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//			
//		for (int i=0 ; i<completion.length ; i++) {
//			
//			if ( !(completion[i].equals(participant[i] ) ) ) {
//				rtn_val = participant[i];
//				break;
//			}
//			
//			if ("".equals( rtn_val )) {
//				rtn_val = participant[participant.length-1];
//			}
//		}
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String player : participant) {
			//hm.put(player, hm.get(player) + 1);
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}		
		
		System.out.println(hm);
		return rtn_val;
	}

}
