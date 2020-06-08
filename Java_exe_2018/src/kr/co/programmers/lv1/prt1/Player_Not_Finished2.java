package kr.co.programmers.lv1.prt1;

import java.util.Arrays;

public class Player_Not_Finished2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player_Not_Finished2 pnf = new Player_Not_Finished2();
		
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

		String rtn_val = "";
		
		// ���� ��Ʈ -> �� ->> ��߳��� ��� ��÷
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		// completion �� �ϳ� ���� (-1)
		// �����ڰ� 1 ���ٰ� �ϴ� -> ������ ����
		for (int i = 0; i<participant.length -1 ; i++) {
			//System.out.println(">" + participant[i] + "/" + completion[i]);
			// ���Ͽ� �ٸ� ��� : participant �� ����
			// ��� �����ϸ� : ������ participant �� ����
			if ( !(participant[i].equals(completion[i])) ) {
				rtn_val = participant[i];
				break;
			}
		}
        // ��� ������ ���
		if ( "".equals(rtn_val))  { // ������ �߰��� �� �ƴٸ�
			rtn_val = participant[participant.length-1]; // ������ value
		}
		
		return rtn_val;
	}
}
